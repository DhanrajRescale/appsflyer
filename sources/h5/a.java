package h5;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17987a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f17988b;

    public a() {
    }

    public static String f(int i10) {
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int h(int i10) {
        return (i10 >> 24) & 255;
    }

    public final void e(int i10) {
        this.f17988b = i10 | this.f17988b;
    }

    public final boolean g(int i10) {
        return (this.f17988b & i10) == i10;
    }

    public String toString() {
        switch (this.f17987a) {
            case 1:
                return f(this.f17988b);
            default:
                return super.toString();
        }
    }

    public a(int i10) {
        this.f17988b = i10;
    }
}
