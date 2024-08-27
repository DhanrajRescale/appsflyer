package m0;

import android.animation.ArgbEvaluator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k7 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26417a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26419c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(a2.a1 a1Var, a2.a1 a1Var2, a2.o0 o0Var, int i10, int i11, Integer num, Integer num2) {
        super(1);
        this.f26420d = a1Var;
        this.f26421e = a1Var2;
        this.f26422f = o0Var;
        this.f26418b = i10;
        this.f26419c = i11;
        this.f26423g = num;
        this.f26424h = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a2.a1 a1Var;
        float f10;
        Bitmap bitmap;
        float z02;
        long j10;
        int i10 = this.f26417a;
        int i11 = this.f26419c;
        int i12 = this.f26418b;
        Object obj2 = this.f26424h;
        Object obj3 = this.f26423g;
        Object obj4 = this.f26420d;
        Object obj5 = this.f26421e;
        Object obj6 = this.f26422f;
        switch (i10) {
            case 0:
                a2.z0 z0Var = (a2.z0) obj;
                a2.a1 a1Var2 = (a2.a1) obj4;
                if (a1Var2 != null && (a1Var = (a2.a1) obj5) != null) {
                    a2.o0 o0Var = (a2.o0) obj6;
                    Integer num = (Integer) obj3;
                    Intrinsics.c(num);
                    int intValue = num.intValue();
                    Integer num2 = (Integer) obj2;
                    Intrinsics.c(num2);
                    int intValue2 = num2.intValue();
                    if (intValue == intValue2) {
                        f10 = m7.f26502d;
                    } else {
                        f10 = m7.f26503e;
                    }
                    int m02 = o0Var.m0(p7.f26653c) + o0Var.m0(f10);
                    int h02 = (o0Var.h0(m7.f26504f) + a1Var.f30b) - intValue;
                    int i13 = (i11 - intValue2) - m02;
                    a2.z0.g(z0Var, a1Var2, (i12 - a1Var2.f29a) / 2, i13);
                    a2.z0.g(z0Var, a1Var, (i12 - a1Var.f29a) / 2, i13 - h02);
                } else if (a1Var2 != null) {
                    float f11 = m7.f26499a;
                    a2.z0.g(z0Var, a1Var2, 0, (i11 - a1Var2.f30b) / 2);
                } else {
                    a2.a1 a1Var3 = (a2.a1) obj5;
                    if (a1Var3 != null) {
                        float f12 = m7.f26499a;
                        a2.z0.g(z0Var, a1Var3, 0, (i11 - a1Var3.f30b) / 2);
                    }
                }
                return Unit.f23355a;
            default:
                p1.h Canvas = (p1.h) obj;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                if (((Boolean) ((t0.g1) obj6).getValue()).booleanValue()) {
                    bitmap = (Bitmap) obj4;
                } else {
                    bitmap = (Bitmap) obj5;
                }
                Paint paint = new Paint(1);
                t0.g1 g1Var = (t0.g1) obj2;
                paint.setTextAlign(Paint.Align.LEFT);
                float f13 = 2;
                Object evaluate = ((ArgbEvaluator) obj3).evaluate(kotlin.ranges.d.c(((Number) g1Var.getValue()).floatValue() * f13, 1.0f), Integer.valueOf(i12), Integer.valueOf(i11));
                Intrinsics.d(evaluate, "null cannot be cast to non-null type kotlin.Int");
                paint.setColor(((Integer) evaluate).intValue());
                float floatValue = ((Number) g1Var.getValue()).floatValue();
                if (floatValue <= 0.5f) {
                    z02 = hl.f.z0(1.0f, 0.6f, floatValue * f13);
                } else {
                    z02 = hl.f.z0(0.6f, 1.0f, (floatValue - 0.5f) * f13);
                }
                float e10 = m1.f.e(Canvas.d()) / 2.0f;
                float c10 = m1.f.c(Canvas.d()) / 2.0f;
                Bitmap bitmap2 = (Bitmap) obj5;
                p1.b f02 = Canvas.f0();
                long b10 = f02.b();
                f02.a().h();
                f02.f30498a.c(z02, z02, t0.t.g(e10, c10));
                if (bitmap2 != null) {
                    float e11 = (m1.f.e(Canvas.d()) / 2.0f) - (bitmap2.getWidth() / 2.0f);
                    float c11 = (m1.f.c(Canvas.d()) / 2.0f) - (bitmap2.getHeight() / 2.0f);
                    j10 = b10;
                    p1.h.U(Canvas, androidx.compose.ui.graphics.a.c(paint.getColor()), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.j(bitmap2.getWidth(), bitmap2.getHeight()), s0.g.f34069a, p1.k.f30509a, 5, 40);
                    if (bitmap != null) {
                        p1.h.z0(Canvas, new n1.e(bitmap), 0L, 0L, hl.f.j((int) e11, (int) c11), 0L, s0.g.f34069a, null, 0, 1014);
                    }
                } else {
                    j10 = b10;
                }
                f02.a().s();
                f02.c(j10);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(Bitmap bitmap, Bitmap bitmap2, t0.g1 g1Var, ArgbEvaluator argbEvaluator, int i10, int i11, t0.g1 g1Var2) {
        super(1);
        this.f26420d = bitmap;
        this.f26421e = bitmap2;
        this.f26422f = g1Var;
        this.f26423g = argbEvaluator;
        this.f26418b = i10;
        this.f26419c = i11;
        this.f26424h = g1Var2;
    }
}
