# se_lab_hw5
ابتدا با yourkit پروفایل برنامه را تحلیل می کنیم:
![img_4.png](img_4.png)


مشاهده میکنیم که نه تنها بخش temp حافظه و زمان اجرای بالایی دارد بلکه میزان بالای مصرف حافظه آن سبب کرش کردن برنامه نیز می شود. 
![img_2.png](img_2.png)


![img.png](img.png)


![img_1.png](img_1.png)


برای رفع این مشکل کافیست که ArrayList را با یک آرایه ساده جایگزین کنیم چرا که هم سایز آرایه از قبل مشخص است هم ArrayList حجم بیشتری نسبت به آرایه ساده می برد هم عملیات add به ArrayList عملیاتی زمان بر است:
![img_3.png](img_3.png)


![img_5.png](img_5.png)


![img_6.png](img_6.png)

اکنون تابع زیر را اضافه میکنیم. تابع countDuplicatesBruteForce یک آرایه دریافت کرده و تعداد عناصر تکراری آن را با دو حلقه روی آرایه میشمرد. این الگوریتم از اردر n^2 است و انتظار داریم که در ورودی های بزرگ برنامه به bottleneck اصلی زمانی تبدیل شود. برای مطمئن شدن، برنامه را با کمک yourkit تحلیل کرده و نتایج را بررسی میکنیم (نکته این که اینجا سعی شده عناصر آرایه عناصری نیمه رندم باشند):
![img_9.png](img_9.png)

![img_7.png](img_7.png)

![img_8.png](img_8.png)
طبق انتظار، مشاهده میکنیم که این تابع زمان زیادی از ما میبرد.