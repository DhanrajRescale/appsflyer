package ak;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements h, yj.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f461a;

    /* renamed from: b, reason: collision with root package name */
    public final i f462b;

    /* renamed from: c, reason: collision with root package name */
    public final g f463c;

    /* renamed from: d, reason: collision with root package name */
    public int f464d = -1;

    /* renamed from: e, reason: collision with root package name */
    public xj.g f465e;

    /* renamed from: f, reason: collision with root package name */
    public List f466f;

    /* renamed from: g, reason: collision with root package name */
    public int f467g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ek.v f468h;

    /* renamed from: i, reason: collision with root package name */
    public File f469i;

    public e(List list, i iVar, g gVar) {
        this.f461a = list;
        this.f462b = iVar;
        this.f463c = gVar;
    }

    @Override // ak.h
    public final boolean b() {
        while (true) {
            List list = this.f466f;
            boolean z10 = false;
            if (list != null && this.f467g < list.size()) {
                this.f468h = null;
                while (!z10 && this.f467g < this.f466f.size()) {
                    List list2 = this.f466f;
                    int i10 = this.f467g;
                    this.f467g = i10 + 1;
                    ek.w wVar = (ek.w) list2.get(i10);
                    File file = this.f469i;
                    i iVar = this.f462b;
                    this.f468h = wVar.b(file, iVar.f496e, iVar.f497f, iVar.f500i);
                    if (this.f468h != null && this.f462b.c(this.f468h.f15630c.a()) != null) {
                        this.f468h.f15630c.d(this.f462b.f506o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f464d + 1;
            this.f464d = i11;
            if (i11 >= this.f461a.size()) {
                return false;
            }
            xj.g gVar = (xj.g) this.f461a.get(this.f464d);
            i iVar2 = this.f462b;
            File b10 = iVar2.f499h.a().b(new f(gVar, iVar2.f505n));
            this.f469i = b10;
            if (b10 != null) {
                this.f465e = gVar;
                this.f466f = this.f462b.f494c.f10802b.j(b10);
                this.f467g = 0;
            }
        }
    }

    @Override // ak.h
    public final void cancel() {
        ek.v vVar = this.f468h;
        if (vVar != null) {
            vVar.f15630c.cancel();
        }
    }

    @Override // yj.d
    public final void e(Exception exc) {
        this.f463c.a(this.f465e, exc, this.f468h.f15630c, xj.a.f40288c);
    }

    @Override // yj.d
    public final void j(Object obj) {
        this.f463c.d(this.f465e, obj, this.f468h.f15630c, xj.a.f40288c, this.f465e);
    }
}
