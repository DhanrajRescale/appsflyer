package b7;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3871c;

    /* renamed from: d, reason: collision with root package name */
    public int f3872d;

    /* renamed from: e, reason: collision with root package name */
    public String f3873e;

    public h0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f3872d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f3870b;
        } else {
            i10 = i11 + this.f3871c;
        }
        this.f3872d = i10;
        this.f3873e = this.f3869a + this.f3872d;
    }

    public final void b() {
        if (this.f3872d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public h0(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.f3869a = str;
        this.f3870b = i11;
        this.f3871c = i12;
        this.f3872d = Integer.MIN_VALUE;
        this.f3873e = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
