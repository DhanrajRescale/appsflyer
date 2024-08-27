package m0;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r4 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26725a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(float f10, long j10, r0.z2 z2Var) {
        super(1);
        this.f26726b = f10;
        this.f26727c = j10;
        this.f26728d = z2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f26725a;
        Object obj2 = this.f26728d;
        long j10 = this.f26727c;
        float f10 = this.f26726b;
        switch (i10) {
            case 0:
                x1 x1Var = (x1) obj;
                x1Var.a(f10, x4.f27081a);
                float f11 = f10 / 2.0f;
                if (!((w4) obj2).f27019a && ((int) (j10 & 4294967295L)) > f11) {
                    x1Var.a(f11, x4.f27083c);
                }
                int i11 = (int) (j10 & 4294967295L);
                if (i11 != 0) {
                    x1Var.a(Math.max(s0.g.f34069a, f10 - i11), x4.f27082b);
                }
                return Unit.f23355a;
            default:
                r0.x0 x0Var = (r0.x0) obj;
                x0Var.f32801a.put(r0.a3.f32324a, Float.valueOf(f10));
                int i12 = (int) (4294967295L & j10);
                float f12 = i12;
                float f13 = f10 / 2;
                LinkedHashMap linkedHashMap = x0Var.f32801a;
                if (f12 > f13 && !((r0.z2) obj2).f32831a) {
                    linkedHashMap.put(r0.a3.f32326c, Float.valueOf(f10 / 2.0f));
                }
                if (i12 != 0) {
                    linkedHashMap.put(r0.a3.f32325b, Float.valueOf(Math.max(s0.g.f34069a, f10 - f12)));
                }
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(float f10, w4 w4Var, long j10) {
        super(1);
        this.f26726b = f10;
        this.f26728d = w4Var;
        this.f26727c = j10;
    }
}
