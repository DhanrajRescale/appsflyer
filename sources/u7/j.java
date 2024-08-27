package u7;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f36926a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36927b;

    /* renamed from: c, reason: collision with root package name */
    public float f36928c;

    /* renamed from: d, reason: collision with root package name */
    public float f36929d;

    /* renamed from: e, reason: collision with root package name */
    public float f36930e;

    /* renamed from: f, reason: collision with root package name */
    public float f36931f;

    /* renamed from: g, reason: collision with root package name */
    public float f36932g;

    /* renamed from: h, reason: collision with root package name */
    public float f36933h;

    /* renamed from: i, reason: collision with root package name */
    public float f36934i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f36935j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36936k;

    /* renamed from: l, reason: collision with root package name */
    public String f36937l;

    public j() {
        this.f36926a = new Matrix();
        this.f36927b = new ArrayList();
        this.f36928c = s0.g.f34069a;
        this.f36929d = s0.g.f34069a;
        this.f36930e = s0.g.f34069a;
        this.f36931f = 1.0f;
        this.f36932g = 1.0f;
        this.f36933h = s0.g.f34069a;
        this.f36934i = s0.g.f34069a;
        this.f36935j = new Matrix();
        this.f36937l = null;
    }

    @Override // u7.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36927b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // u7.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f36927b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f36935j;
        matrix.reset();
        matrix.postTranslate(-this.f36929d, -this.f36930e);
        matrix.postScale(this.f36931f, this.f36932g);
        matrix.postRotate(this.f36928c, s0.g.f34069a, s0.g.f34069a);
        matrix.postTranslate(this.f36933h + this.f36929d, this.f36934i + this.f36930e);
    }

    public String getGroupName() {
        return this.f36937l;
    }

    public Matrix getLocalMatrix() {
        return this.f36935j;
    }

    public float getPivotX() {
        return this.f36929d;
    }

    public float getPivotY() {
        return this.f36930e;
    }

    public float getRotation() {
        return this.f36928c;
    }

    public float getScaleX() {
        return this.f36931f;
    }

    public float getScaleY() {
        return this.f36932g;
    }

    public float getTranslateX() {
        return this.f36933h;
    }

    public float getTranslateY() {
        return this.f36934i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f36929d) {
            this.f36929d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f36930e) {
            this.f36930e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f36928c) {
            this.f36928c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f36931f) {
            this.f36931f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f36932g) {
            this.f36932g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f36933h) {
            this.f36933h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f36934i) {
            this.f36934i = f10;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [u7.l, u7.i] */
    public j(j jVar, t.f fVar) {
        l lVar;
        this.f36926a = new Matrix();
        this.f36927b = new ArrayList();
        this.f36928c = s0.g.f34069a;
        this.f36929d = s0.g.f34069a;
        this.f36930e = s0.g.f34069a;
        this.f36931f = 1.0f;
        this.f36932g = 1.0f;
        this.f36933h = s0.g.f34069a;
        this.f36934i = s0.g.f34069a;
        Matrix matrix = new Matrix();
        this.f36935j = matrix;
        this.f36937l = null;
        this.f36928c = jVar.f36928c;
        this.f36929d = jVar.f36929d;
        this.f36930e = jVar.f36930e;
        this.f36931f = jVar.f36931f;
        this.f36932g = jVar.f36932g;
        this.f36933h = jVar.f36933h;
        this.f36934i = jVar.f36934i;
        String str = jVar.f36937l;
        this.f36937l = str;
        this.f36936k = jVar.f36936k;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f36935j);
        ArrayList arrayList = jVar.f36927b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f36927b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f36916f = s0.g.f34069a;
                    lVar2.f36918h = 1.0f;
                    lVar2.f36919i = 1.0f;
                    lVar2.f36920j = s0.g.f34069a;
                    lVar2.f36921k = 1.0f;
                    lVar2.f36922l = s0.g.f34069a;
                    lVar2.f36923m = Paint.Cap.BUTT;
                    lVar2.f36924n = Paint.Join.MITER;
                    lVar2.f36925o = 4.0f;
                    lVar2.f36915e = iVar.f36915e;
                    lVar2.f36916f = iVar.f36916f;
                    lVar2.f36918h = iVar.f36918h;
                    lVar2.f36917g = iVar.f36917g;
                    lVar2.f36940c = iVar.f36940c;
                    lVar2.f36919i = iVar.f36919i;
                    lVar2.f36920j = iVar.f36920j;
                    lVar2.f36921k = iVar.f36921k;
                    lVar2.f36922l = iVar.f36922l;
                    lVar2.f36923m = iVar.f36923m;
                    lVar2.f36924n = iVar.f36924n;
                    lVar2.f36925o = iVar.f36925o;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f36927b.add(lVar);
                Object obj2 = lVar.f36939b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
