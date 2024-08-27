package ak;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Queue;

/* loaded from: classes.dex */
public final class g0 implements xj.g {

    /* renamed from: j, reason: collision with root package name */
    public static final rk.g f482j = new rk.g(50);

    /* renamed from: b, reason: collision with root package name */
    public final bk.h f483b;

    /* renamed from: c, reason: collision with root package name */
    public final xj.g f484c;

    /* renamed from: d, reason: collision with root package name */
    public final xj.g f485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f486e;

    /* renamed from: f, reason: collision with root package name */
    public final int f487f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f488g;

    /* renamed from: h, reason: collision with root package name */
    public final xj.k f489h;

    /* renamed from: i, reason: collision with root package name */
    public final xj.o f490i;

    public g0(bk.h hVar, xj.g gVar, xj.g gVar2, int i10, int i11, xj.o oVar, Class cls, xj.k kVar) {
        this.f483b = hVar;
        this.f484c = gVar;
        this.f485d = gVar2;
        this.f486e = i10;
        this.f487f = i11;
        this.f490i = oVar;
        this.f488g = cls;
        this.f489h = kVar;
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        Object e10;
        bk.h hVar = this.f483b;
        synchronized (hVar) {
            bk.c cVar = hVar.f7047b;
            bk.k kVar = (bk.k) ((Queue) cVar.f3178b).poll();
            if (kVar == null) {
                kVar = cVar.h();
            }
            bk.g gVar = (bk.g) kVar;
            gVar.f7044b = 8;
            gVar.f7045c = byte[].class;
            e10 = hVar.e(gVar, byte[].class);
        }
        byte[] bArr = (byte[]) e10;
        ByteBuffer.wrap(bArr).putInt(this.f486e).putInt(this.f487f).array();
        this.f485d.a(messageDigest);
        this.f484c.a(messageDigest);
        messageDigest.update(bArr);
        xj.o oVar = this.f490i;
        if (oVar != null) {
            oVar.a(messageDigest);
        }
        this.f489h.a(messageDigest);
        rk.g gVar2 = f482j;
        Class cls = this.f488g;
        byte[] bArr2 = (byte[]) gVar2.a(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(xj.g.f40298a);
            gVar2.d(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.f483b.g(bArr);
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f487f != g0Var.f487f || this.f486e != g0Var.f486e || !rk.k.a(this.f490i, g0Var.f490i) || !this.f488g.equals(g0Var.f488g) || !this.f484c.equals(g0Var.f484c) || !this.f485d.equals(g0Var.f485d) || !this.f489h.equals(g0Var.f489h)) {
            return false;
        }
        return true;
    }

    @Override // xj.g
    public final int hashCode() {
        int hashCode = ((((this.f485d.hashCode() + (this.f484c.hashCode() * 31)) * 31) + this.f486e) * 31) + this.f487f;
        xj.o oVar = this.f490i;
        if (oVar != null) {
            hashCode = (hashCode * 31) + oVar.hashCode();
        }
        return this.f489h.f40305b.hashCode() + ((this.f488g.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f484c + ", signature=" + this.f485d + ", width=" + this.f486e + ", height=" + this.f487f + ", decodedResourceClass=" + this.f488g + ", transformation='" + this.f490i + "', options=" + this.f489h + UrlTreeKt.componentParamSuffixChar;
    }
}
