package com.webengage.sdk.android.actions.render;

import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
class l {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12383a;

        static {
            int[] iArr = new int[WebEngageConstant.STYLE.values().length];
            f12383a = iArr;
            try {
                iArr[WebEngageConstant.STYLE.BIG_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12383a[WebEngageConstant.STYLE.BIG_PICTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12383a[WebEngageConstant.STYLE.CAROUSEL_V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12383a[WebEngageConstant.STYLE.RATING_V1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static CustomPushRender a(WebEngageConstant.STYLE style) {
        int i10 = a.f12383a[style.ordinal()];
        if (i10 == 1) {
            return new d();
        }
        if (i10 == 2) {
            return new c();
        }
        if (i10 == 3) {
            return new e();
        }
        if (i10 != 4) {
            return null;
        }
        return new m();
    }

    public static CustomPushRerender b(WebEngageConstant.STYLE style) {
        int i10 = a.f12383a[style.ordinal()];
        if (i10 == 3) {
            return new e();
        }
        if (i10 != 4) {
            return null;
        }
        return new m();
    }
}
