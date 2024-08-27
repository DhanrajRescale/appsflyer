package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import lp.o1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Uri f16558a;

    /* renamed from: b, reason: collision with root package name */
    public long f16559b;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16561d;

    /* renamed from: f, reason: collision with root package name */
    public long f16563f;

    /* renamed from: h, reason: collision with root package name */
    public String f16565h;

    /* renamed from: i, reason: collision with root package name */
    public int f16566i;

    /* renamed from: j, reason: collision with root package name */
    public Object f16567j;

    /* renamed from: c, reason: collision with root package name */
    public int f16560c = 1;

    /* renamed from: e, reason: collision with root package name */
    public Map f16562e = Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public long f16564g = -1;

    public final i a() {
        yk.j.J0(this.f16558a, "The uri must be set.");
        return new i(this.f16558a, this.f16559b, this.f16560c, this.f16561d, this.f16562e, this.f16563f, this.f16564g, this.f16565h, this.f16566i, this.f16567j);
    }

    public final void b(int i10) {
        this.f16566i = i10;
    }

    public final void c() {
        this.f16562e = o1.f25026g;
    }

    public final void d(String str) {
        this.f16565h = str;
    }
}
