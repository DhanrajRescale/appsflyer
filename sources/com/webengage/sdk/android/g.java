package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Intent;
import com.webengage.sdk.android.Analytics;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
class g implements i0<Analytics> {

    /* renamed from: a, reason: collision with root package name */
    private int f12547a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f12548b;

    public g(int i10, Object... objArr) {
        this.f12547a = i10;
        this.f12548b = objArr;
    }

    public void a(Analytics analytics) {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            r4 = null;
            Map<String, ? extends Object> map = null;
            switch (this.f12547a) {
                case 0:
                    Object[] objArr = this.f12548b;
                    if (objArr != null) {
                        analytics.track(objArr.length > 0 ? (String) objArr[0] : null, objArr.length > 1 ? (Map) objArr[1] : null, objArr.length > 2 ? (Analytics.Options) objArr[2] : null);
                        return;
                    }
                    return;
                case 1:
                    Object[] objArr2 = this.f12548b;
                    if (objArr2 == null || objArr2.length <= 0 || (obj = objArr2[0]) == null) {
                        return;
                    }
                    WeakReference weakReference = (WeakReference) obj;
                    if (weakReference.get() != null) {
                        analytics.start((Activity) weakReference.get());
                        return;
                    }
                    return;
                case 2:
                    Object[] objArr3 = this.f12548b;
                    if (objArr3 == null || objArr3.length <= 0 || (obj2 = objArr3[0]) == null) {
                        return;
                    }
                    WeakReference weakReference2 = (WeakReference) obj2;
                    if (weakReference2.get() != null) {
                        analytics.stop((Activity) weakReference2.get());
                        return;
                    }
                    return;
                case 3:
                    Object[] objArr4 = this.f12548b;
                    if (objArr4 != null) {
                        analytics.screenNavigated(objArr4.length > 0 ? (String) objArr4[0] : null, objArr4.length > 1 ? (Map) objArr4[1] : null);
                        return;
                    }
                    return;
                case 4:
                    Object[] objArr5 = this.f12548b;
                    if (objArr5 == null || objArr5.length <= 0) {
                        return;
                    }
                    analytics.setScreenData((Map) objArr5[0]);
                    return;
                case 5:
                    Object[] objArr6 = this.f12548b;
                    if (objArr6 == null || objArr6.length <= 0) {
                        return;
                    }
                    analytics.installed((Intent) objArr6[0]);
                    return;
                case 6:
                    Object[] objArr7 = this.f12548b;
                    if (objArr7 != null) {
                        String str = objArr7.length > 0 ? (String) objArr7[0] : null;
                        Map<String, ? extends Object> map2 = objArr7.length > 1 ? (Map) objArr7[1] : null;
                        if (objArr7.length > 2 && (obj3 = objArr7[2]) != null) {
                            map = (Map) obj3;
                        }
                        analytics.trackSystem(str, map2, map);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while executing queued task of Analytics: " + e10.toString());
        }
    }
}
