package j0;

import a2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends iu.h implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar) {
        super(1, iu.j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f20563i = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((k0) obj).f28151a;
        u uVar = (u) ((k) this.f20563i).f20597o.getValue();
        if (uVar != null) {
            if (!uVar.m()) {
                uVar = null;
            }
            if (uVar != null) {
                uVar.n(fArr);
            }
        }
        return Unit.f23355a;
    }
}
