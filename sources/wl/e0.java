package wl;

import com.facebook.FacebookSdk;
import java.util.Arrays;

/* loaded from: classes.dex */
public enum e0 {
    FACEBOOK("facebook"),
    INSTAGRAM(FacebookSdk.INSTAGRAM);


    /* renamed from: a, reason: collision with root package name */
    public final String f39176a;

    e0(String str) {
        this.f39176a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e0[] valuesCustom() {
        return (e0[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f39176a;
    }
}
