package u7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import t.j0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f36942p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f36943a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f36944b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f36945c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f36946d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f36947e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f36948f;

    /* renamed from: g, reason: collision with root package name */
    public final j f36949g;

    /* renamed from: h, reason: collision with root package name */
    public float f36950h;

    /* renamed from: i, reason: collision with root package name */
    public float f36951i;

    /* renamed from: j, reason: collision with root package name */
    public float f36952j;

    /* renamed from: k, reason: collision with root package name */
    public float f36953k;

    /* renamed from: l, reason: collision with root package name */
    public int f36954l;

    /* renamed from: m, reason: collision with root package name */
    public String f36955m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f36956n;

    /* renamed from: o, reason: collision with root package name */
    public final t.f f36957o;

    /* JADX WARN: Type inference failed for: r0v4, types: [t.j0, t.f] */
    public m() {
        this.f36945c = new Matrix();
        this.f36950h = s0.g.f34069a;
        this.f36951i = s0.g.f34069a;
        this.f36952j = s0.g.f34069a;
        this.f36953k = s0.g.f34069a;
        this.f36954l = 255;
        this.f36955m = null;
        this.f36956n = null;
        this.f36957o = new j0();
        this.f36949g = new j();
        this.f36943a = new Path();
        this.f36944b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        boolean z10;
        Path.FillType fillType;
        Path.FillType fillType2;
        jVar.f36926a.set(matrix);
        Matrix matrix2 = jVar.f36926a;
        matrix2.preConcat(jVar.f36935j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = jVar.f36927b;
            if (i13 < arrayList.size()) {
                k kVar = (k) arrayList.get(i13);
                if (kVar instanceof j) {
                    a((j) kVar, matrix2, canvas, i10, i11);
                } else if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f12 = i10 / this.f36952j;
                    float f13 = i11 / this.f36953k;
                    float min = Math.min(f12, f13);
                    Matrix matrix3 = this.f36945c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f12, f13);
                    float[] fArr = {s0.g.f34069a, 1.0f, 1.0f, s0.g.f34069a};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i12 = i13;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > s0.g.f34069a) {
                        f10 = Math.abs(f14) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != s0.g.f34069a) {
                        lVar.getClass();
                        Path path = this.f36943a;
                        path.reset();
                        u3.d[] dVarArr = lVar.f36938a;
                        if (dVarArr != null) {
                            u3.d.b(dVarArr, path);
                        }
                        Path path2 = this.f36944b;
                        path2.reset();
                        if (lVar instanceof h) {
                            if (lVar.f36940c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f15 = iVar.f36920j;
                            if (f15 != s0.g.f34069a || iVar.f36921k != 1.0f) {
                                float f16 = iVar.f36922l;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (iVar.f36921k + f16) % 1.0f;
                                if (this.f36948f == null) {
                                    this.f36948f = new PathMeasure();
                                }
                                this.f36948f.setPath(path, false);
                                float length = this.f36948f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f36948f.getSegment(f19, length, path, true);
                                    PathMeasure pathMeasure = this.f36948f;
                                    f11 = s0.g.f34069a;
                                    pathMeasure.getSegment(s0.g.f34069a, f20, path, true);
                                } else {
                                    f11 = 0.0f;
                                    this.f36948f.getSegment(f19, f20, path, true);
                                }
                                path.rLineTo(f11, f11);
                            }
                            path2.addPath(path, matrix3);
                            l0.j jVar2 = iVar.f36917g;
                            if (((Shader) jVar2.f23774b) != null || jVar2.f23773a != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (this.f36947e == null) {
                                    Paint paint = new Paint(1);
                                    this.f36947e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f36947e;
                                Object obj = jVar2.f23774b;
                                if (((Shader) obj) != null) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f36919i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = jVar2.f23773a;
                                    float f21 = iVar.f36919i;
                                    PorterDuff.Mode mode = p.f36971j;
                                    paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (iVar.f36940c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            l0.j jVar3 = iVar.f36915e;
                            if (((Shader) jVar3.f23774b) != null || jVar3.f23773a != 0) {
                                if (this.f36946d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f36946d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f36946d;
                                Paint.Join join = iVar.f36924n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f36923m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f36925o);
                                Object obj2 = jVar3.f23774b;
                                if (((Shader) obj2) != null) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f36918h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = jVar3.f23773a;
                                    float f22 = iVar.f36918h;
                                    PorterDuff.Mode mode2 = p.f36971j;
                                    paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f36916f * f10 * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i13 = i12 + 1;
                    c10 = 0;
                }
                i12 = i13;
                i13 = i12 + 1;
                c10 = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f36954l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f36954l = i10;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [t.j0, t.f] */
    public m(m mVar) {
        this.f36945c = new Matrix();
        this.f36950h = s0.g.f34069a;
        this.f36951i = s0.g.f34069a;
        this.f36952j = s0.g.f34069a;
        this.f36953k = s0.g.f34069a;
        this.f36954l = 255;
        this.f36955m = null;
        this.f36956n = null;
        ?? j0Var = new j0(0);
        this.f36957o = j0Var;
        this.f36949g = new j(mVar.f36949g, j0Var);
        this.f36943a = new Path(mVar.f36943a);
        this.f36944b = new Path(mVar.f36944b);
        this.f36950h = mVar.f36950h;
        this.f36951i = mVar.f36951i;
        this.f36952j = mVar.f36952j;
        this.f36953k = mVar.f36953k;
        this.f36954l = mVar.f36954l;
        this.f36955m = mVar.f36955m;
        String str = mVar.f36955m;
        if (str != null) {
            j0Var.put(str, this);
        }
        this.f36956n = mVar.f36956n;
    }
}
