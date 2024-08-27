package ek;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class l implements xj.g {

    /* renamed from: b, reason: collision with root package name */
    public final m f15603b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f15604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15605d;

    /* renamed from: e, reason: collision with root package name */
    public String f15606e;

    /* renamed from: f, reason: collision with root package name */
    public URL f15607f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f15608g;

    /* renamed from: h, reason: collision with root package name */
    public int f15609h;

    public l(URL url) {
        p pVar = m.f15610a;
        if (url == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f15604c = url;
        this.f15605d = null;
        if (pVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f15603b = pVar;
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        if (this.f15608g == null) {
            this.f15608g = c().getBytes(xj.g.f40298a);
        }
        messageDigest.update(this.f15608g);
    }

    public final String c() {
        String str = this.f15605d;
        if (str == null) {
            URL url = this.f15604c;
            al.d.V(url);
            return url.toString();
        }
        return str;
    }

    public final URL d() {
        if (this.f15607f == null) {
            if (TextUtils.isEmpty(this.f15606e)) {
                String str = this.f15605d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f15604c;
                    al.d.V(url);
                    str = url.toString();
                }
                this.f15606e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f15607f = new URL(this.f15606e);
        }
        return this.f15607f;
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!c().equals(lVar.c()) || !this.f15603b.equals(lVar.f15603b)) {
            return false;
        }
        return true;
    }

    @Override // xj.g
    public final int hashCode() {
        if (this.f15609h == 0) {
            int hashCode = c().hashCode();
            this.f15609h = hashCode;
            this.f15609h = this.f15603b.hashCode() + (hashCode * 31);
        }
        return this.f15609h;
    }

    public final String toString() {
        return c();
    }

    public l(String str) {
        p pVar = m.f15610a;
        this.f15604c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f15605d = str;
        if (pVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f15603b = pVar;
    }
}
