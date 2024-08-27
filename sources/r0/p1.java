package r0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, int i10) {
        super(0);
        this.f32667a = i10;
        this.f32668b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f32667a;
        Object obj = this.f32668b;
        switch (i10) {
            case 0:
                ((Function0) obj).mo2invoke();
                return Boolean.TRUE;
            default:
                w2.b bVar = ((z2) obj).f32834d;
                if (bVar != null) {
                    return Float.valueOf(bVar.c0(125));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
        }
    }
}
