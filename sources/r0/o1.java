package r0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f32634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(z2 z2Var, int i10) {
        super(1);
        this.f32633a = i10;
        this.f32634b = z2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f32633a;
        z2 z2Var = this.f32634b;
        switch (i10) {
            case 0:
                return new w2.h(hl.f.j(0, (int) z2Var.f32833c.g()));
            default:
                ((Number) obj).floatValue();
                w2.b bVar = z2Var.f32834d;
                if (bVar != null) {
                    return Float.valueOf(bVar.c0(56));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
        }
    }
}
