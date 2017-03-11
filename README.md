# VerificationCodeInput
[![](https://jitpack.io/v/liuguangli/VerificationCodeInput.svg)](https://jitpack.io/#liuguangli/VerificationCodeInput)

简洁验证码输入框，能自定义输入框个数和样式。

![](https://github.com/liuguangli/VerificationCodeInput/blob/master/verification1.gif)

# How to use
    <com.dalimao.corelibrary.VerificationCodeInput
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            ver:box="4"
            ver:child_h_padding="5dp"
            android:layout_centerInParent="true"
            android:id="@+id/verificationCodeInput"
            android:layout_marginBottom="16dp"
            />

监听输入完成：

    VerificationCodeInput input = (VerificationCodeInput) findViewById(R.id.verificationCodeInput);
    input.setOnCompleteListener(new VerificationCodeInput.Listener() {
          @Override
          public void onComplete(String content) {
             Log.d(TAG, "完成输入：" + content);
          }
    });

你还可以为输入框定义自己的样式，指定属性 box_bg_normal 和 box_bg_focus：

    <com.dalimao.corelibrary.VerificationCodeInput
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            ver:box="4"
            ver:box_bg_normal="@drawable/verification_edit_bg_normal"
            ver:box_bg_focus="@drawable/verification_edit_bg_focus"
            ver:child_h_padding="5dp"
            android:layout_centerInParent="true"
            android:layout_marginBottom="16dp"
            />

自定义个数，指定属性  box：

    <com.dalimao.corelibrary.VerificationCodeInput
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            ver:box="5"
            ver:box_bg_normal="@drawable/verification_edit_bg_normal"
            ver:box_bg_focus="@drawable/verification_edit_bg_focus"
            ver:child_h_padding="5dp"
            android:layout_centerInParent="true"
            android:layout_marginBottom="16dp"
            />

自定义输入类型：指定属性 inputType：

     <com.dalimao.corelibrary.VerificationCodeInput
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         ver:box="5"
         ver:box_bg_normal="@drawable/verification_edit_bg_normal"
         ver:box_bg_focus="@drawable/verification_edit_bg_focus"
         ver:child_h_padding="5dp"
         ver:inputType="password"
         android:layout_centerInParent="true"
         android:layout_marginBottom="16dp"
         />

![](https://github.com/liuguangli/VerificationCodeInput/blob/master/verification.gif)
# Gradle dependencies

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.liuguangli:VerificationCodeInput:1.3'

	}

# MIT

MIT License

Copyright (c) 2017 刘光利

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
