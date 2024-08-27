package gd;

import com.assetgro.stockgro.data.model.AuthType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17264a;

    static {
        int[] iArr = new int[AuthType.values().length];
        try {
            iArr[AuthType.FACEBOOK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthType.LINKEDIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17264a = iArr;
    }
}
