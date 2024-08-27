package ak;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements xj.g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f602d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f603e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f604f;

    /* renamed from: g, reason: collision with root package name */
    public final xj.g f605g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f606h;

    /* renamed from: i, reason: collision with root package name */
    public final xj.k f607i;

    /* renamed from: j, reason: collision with root package name */
    public int f608j;

    public x(Object obj, xj.g gVar, int i10, int i11, rk.b bVar, Class cls, Class cls2, xj.k kVar) {
        if (obj != null) {
            this.f600b = obj;
            if (gVar != null) {
                this.f605g = gVar;
                this.f601c = i10;
                this.f602d = i11;
                if (bVar != null) {
                    this.f606h = bVar;
                    if (cls != null) {
                        this.f603e = cls;
                        if (cls2 != null) {
                            this.f604f = cls2;
                            if (kVar != null) {
                                this.f607i = kVar;
                                return;
                            }
                            throw new NullPointerException("Argument must not be null");
                        }
                        throw new NullPointerException("Transcode class must not be null");
                    }
                    throw new NullPointerException("Resource class must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Signature must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f600b.equals(xVar.f600b) || !this.f605g.equals(xVar.f605g) || this.f602d != xVar.f602d || this.f601c != xVar.f601c || !this.f606h.equals(xVar.f606h) || !this.f603e.equals(xVar.f603e) || !this.f604f.equals(xVar.f604f) || !this.f607i.equals(xVar.f607i)) {
            return false;
        }
        return true;
    }

    @Override // xj.g
    public final int hashCode() {
        if (this.f608j == 0) {
            int hashCode = this.f600b.hashCode();
            this.f608j = hashCode;
            int hashCode2 = ((((this.f605g.hashCode() + (hashCode * 31)) * 31) + this.f601c) * 31) + this.f602d;
            this.f608j = hashCode2;
            int hashCode3 = this.f606h.hashCode() + (hashCode2 * 31);
            this.f608j = hashCode3;
            int hashCode4 = this.f603e.hashCode() + (hashCode3 * 31);
            this.f608j = hashCode4;
            int hashCode5 = this.f604f.hashCode() + (hashCode4 * 31);
            this.f608j = hashCode5;
            this.f608j = this.f607i.f40305b.hashCode() + (hashCode5 * 31);
        }
        return this.f608j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f600b + ", width=" + this.f601c + ", height=" + this.f602d + ", resourceClass=" + this.f603e + ", transcodeClass=" + this.f604f + ", signature=" + this.f605g + ", hashCode=" + this.f608j + ", transformations=" + this.f606h + ", options=" + this.f607i + UrlTreeKt.componentParamSuffixChar;
    }
}
