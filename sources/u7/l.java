package u7;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public u3.d[] f36938a;

    /* renamed from: b, reason: collision with root package name */
    public String f36939b;

    /* renamed from: c, reason: collision with root package name */
    public int f36940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36941d;

    public l() {
        this.f36938a = null;
        this.f36940c = 0;
    }

    public u3.d[] getPathData() {
        return this.f36938a;
    }

    public String getPathName() {
        return this.f36939b;
    }

    public void setPathData(u3.d[] dVarArr) {
        if (!yk.j.D0(this.f36938a, dVarArr)) {
            this.f36938a = yk.j.Q0(dVarArr);
            return;
        }
        u3.d[] dVarArr2 = this.f36938a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f36708a = dVarArr[i10].f36708a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f36709b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f36709b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f36938a = null;
        this.f36940c = 0;
        this.f36939b = lVar.f36939b;
        this.f36941d = lVar.f36941d;
        this.f36938a = yk.j.Q0(lVar.f36938a);
    }
}
