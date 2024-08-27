package pd;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f30938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(e1.s sVar, int i10) {
        super(2);
        this.f30937a = i10;
        this.f30938b = sVar;
    }

    public final void a(CreateGroupUser addUser, boolean z10) {
        int i10 = this.f30937a;
        e1.s sVar = this.f30938b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(addUser, "addUser");
                if (z10) {
                    sVar.add(0, addUser);
                    return;
                } else {
                    sVar.remove(addUser);
                    return;
                }
            case 1:
                Intrinsics.checkNotNullParameter(addUser, "user");
                if (z10) {
                    sVar.add(0, addUser);
                    return;
                } else {
                    sVar.remove(addUser);
                    return;
                }
            case 2:
                Intrinsics.checkNotNullParameter(addUser, "user");
                if (z10) {
                    sVar.add(0, addUser);
                    return;
                } else {
                    sVar.remove(addUser);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(addUser, "addUser");
                if (z10) {
                    sVar.add(0, addUser);
                    return;
                } else {
                    sVar.remove(addUser);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30937a) {
            case 0:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 1:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 2:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            default:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
        }
    }
}
