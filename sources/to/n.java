package to;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final v[] f36292a = new v[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f36293b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f36294c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f36295d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f36296e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f36297f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final v f36298g = new v();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f36299h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f36300i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f36301j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f36302k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f36303l = true;

    public n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f36292a[i10] = new v();
            this.f36293b[i10] = new Matrix();
            this.f36294c[i10] = new Matrix();
        }
    }

    public final void a(l lVar, float f10, RectF rectF, ek.u uVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        v[] vVarArr;
        float abs;
        e eVar;
        Path path2;
        Path path3;
        ek.u uVar2;
        c cVar;
        vl.b bVar;
        Path path4;
        n nVar = this;
        l lVar2 = lVar;
        ek.u uVar3 = uVar;
        Path path5 = path;
        path.rewind();
        Path path6 = nVar.f36296e;
        path6.rewind();
        Path path7 = nVar.f36297f;
        path7.rewind();
        path7.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = nVar.f36294c;
            fArr = nVar.f36299h;
            matrixArr2 = nVar.f36293b;
            vVarArr = nVar.f36292a;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = lVar2.f36284f;
                    } else {
                        cVar = lVar2.f36283e;
                    }
                } else {
                    cVar = lVar2.f36286h;
                }
            } else {
                cVar = lVar2.f36285g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        bVar = lVar2.f36280b;
                    } else {
                        bVar = lVar2.f36279a;
                    }
                } else {
                    bVar = lVar2.f36282d;
                }
            } else {
                bVar = lVar2.f36281c;
            }
            v vVar = vVarArr[i11];
            bVar.getClass();
            bVar.p(f10, cVar.a(rectF), vVar);
            int i12 = i11 + 1;
            float f11 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = nVar.f36295d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        path4 = path6;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        path4 = path6;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    path4 = path6;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                path4 = path6;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f11);
            v vVar2 = vVarArr[i11];
            fArr[0] = vVar2.f36324c;
            fArr[1] = vVar2.f36325d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f11);
            i11 = i12;
            path6 = path4;
        }
        Path path8 = path6;
        int i13 = 0;
        while (i13 < i10) {
            v vVar3 = vVarArr[i13];
            fArr[0] = vVar3.f36322a;
            fArr[1] = vVar3.f36323b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path5.moveTo(fArr[0], fArr[1]);
            } else {
                path5.lineTo(fArr[0], fArr[1]);
            }
            vVarArr[i13].b(matrixArr2[i13], path5);
            if (uVar3 != null) {
                v vVar4 = vVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                BitSet bitSet = ((h) uVar3.f15627b).f36256d;
                vVar4.getClass();
                bitSet.set(i13, false);
                u[] uVarArr = ((h) uVar3.f15627b).f36254b;
                vVar4.a(vVar4.f36327f);
                uVarArr[i13] = new o(new ArrayList(vVar4.f36329h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            v vVar5 = vVarArr[i13];
            fArr[0] = vVar5.f36324c;
            fArr[1] = vVar5.f36325d;
            matrixArr2[i13].mapPoints(fArr);
            v vVar6 = vVarArr[i15];
            float f12 = vVar6.f36322a;
            float[] fArr2 = nVar.f36300i;
            fArr2[0] = f12;
            fArr2[1] = vVar6.f36323b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, s0.g.f34069a);
            v vVar7 = vVarArr[i13];
            fArr[0] = vVar7.f36324c;
            fArr[1] = vVar7.f36325d;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            v vVar8 = nVar.f36298g;
            vVar8.d(s0.g.f34069a, s0.g.f34069a, 270.0f, s0.g.f34069a);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = lVar2.f36288j;
                    } else {
                        eVar = lVar2.f36287i;
                    }
                } else {
                    eVar = lVar2.f36290l;
                }
            } else {
                eVar = lVar2.f36289k;
            }
            eVar.d(max, abs, f10, vVar8);
            Path path9 = nVar.f36301j;
            path9.reset();
            vVar8.b(matrixArr[i13], path9);
            if (!nVar.f36303l || (!eVar.a() && !nVar.b(path9, i13) && !nVar.b(path9, i15))) {
                path2 = path8;
                path3 = path;
                vVar8.b(matrixArr[i13], path3);
                uVar2 = uVar;
            } else {
                path9.op(path9, path7, Path.Op.DIFFERENCE);
                fArr[0] = vVar8.f36322a;
                fArr[1] = vVar8.f36323b;
                matrixArr[i13].mapPoints(fArr);
                path2 = path8;
                path2.moveTo(fArr[0], fArr[1]);
                vVar8.b(matrixArr[i13], path2);
                uVar2 = uVar;
                path3 = path;
            }
            if (uVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                ((h) uVar2.f15627b).f36256d.set(i13 + 4, false);
                u[] uVarArr2 = ((h) uVar2.f15627b).f36255c;
                vVar8.a(vVar8.f36327f);
                uVarArr2[i13] = new o(new ArrayList(vVar8.f36329h), new Matrix(matrix2));
            }
            nVar = this;
            lVar2 = lVar;
            path5 = path3;
            i13 = i14;
            path8 = path2;
            i10 = 4;
            uVar3 = uVar2;
        }
        Path path10 = path5;
        Path path11 = path8;
        path.close();
        path11.close();
        if (!path11.isEmpty()) {
            path10.op(path11, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f36302k;
        path2.reset();
        this.f36292a[i10].b(this.f36293b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
