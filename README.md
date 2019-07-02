# RoundCornerProgressBar
A lightweight rounded corner ProgressBar / 轻量圆角进度条

<img src="/screenshot/preview.gif" width="40%" />

## MinSDK
minSdkVersion 21

## Attributes / 属性
| attributes / 属性 | description / 描述 |
| ------------- | ------------- |
| rcpb_stroke_width     | 边框宽度 (默认 3dp) |
| rcpb_stroke_color     | 边框颜色 |
| rcpb_progress_color   | 进度条颜色 |
| rcpb_progress         | 进度 (0 - 1) |

## How to use it / 使用
#### Layout
```xml
<moe.yukinoneko.roundcornerprogressbar.RoundCornerProgressBar
        android:id="@+id/progressBar"
        android:layout_width="match_parent"
        android:layout_height="20dp"
        app:rcpb_stroke_width="3dp"
        app:rcpb_stroke_color="#FFDAE1FE"
        app:rcpb_progress_color="#FF6087DB"
        app:rcpb_progress="0.5" />
```
#### Function / 方法
```kotlin
fun getProgress(): Float
fun setProgress(@FloatRange(from = 0.0, to = 1.0) progress: Float)
fun setSmoothProgress(@FloatRange(from = 0.0, to = 1.0) progress: Float, duration: Long = 1000)
```

## License
```
Copyright 2019 SamuelGjk. https://github.com/SamuelGjk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```