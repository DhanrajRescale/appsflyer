package mt;

/* loaded from: classes2.dex */
public final class x extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final at.f[] f28070a;

    /* renamed from: b, reason: collision with root package name */
    public final et.d f28071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28072c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28073d = false;

    public x(at.f[] fVarArr, ll.o oVar, int i10) {
        this.f28070a = fVarArr;
        this.f28071b = oVar;
        this.f28072c = i10;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        at.f[] fVarArr = this.f28070a;
        fVarArr.getClass();
        int length = fVarArr.length;
        if (length == 0) {
            gVar.c(ft.c.f16242a);
            gVar.onComplete();
            return;
        }
        v vVar = new v(gVar, this.f28071b, length, this.f28073d);
        int i10 = this.f28072c;
        w[] wVarArr = vVar.f28061c;
        int length2 = wVarArr.length;
        for (int i11 = 0; i11 < length2; i11++) {
            wVarArr[i11] = new w(vVar, i10);
        }
        vVar.lazySet(0);
        vVar.f28059a.c(vVar);
        for (int i12 = 0; i12 < length2 && !vVar.f28064f; i12++) {
            ((at.e) fVarArr[i12]).e(wVarArr[i12]);
        }
    }
}
