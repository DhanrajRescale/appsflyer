package ie;

import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupDetailHostActivity f19948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(GroupDetailHostActivity groupDetailHostActivity, int i10) {
        super(2);
        this.f19947a = i10;
        this.f19948b = groupDetailHostActivity;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        int i11 = this.f19947a;
        GroupDetailHostActivity groupDetailHostActivity = this.f19948b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                String str5 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                if (str5 == null) {
                    str = "User";
                } else {
                    str = str5;
                }
                el.l.e(null, str, new q(groupDetailHostActivity, 5), new q(groupDetailHostActivity, 6), nVar, 0, 1);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                String str6 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                if (str6 == null) {
                    str2 = "User";
                } else {
                    str2 = str6;
                }
                el.l.g(null, str2, new q(groupDetailHostActivity, 7), nVar, 0, 1);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                String str7 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                if (str7 == null) {
                    str3 = "User";
                } else {
                    str3 = str7;
                }
                el.l.e(null, str3, new q(groupDetailHostActivity, 24), new q(groupDetailHostActivity, 25), nVar, 0, 1);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                String str8 = ((GroupChatHostViewModel) groupDetailHostActivity.x()).B;
                if (str8 == null) {
                    str4 = "User";
                } else {
                    str4 = str8;
                }
                el.l.g(null, str4, new q(groupDetailHostActivity, 26), nVar, 0, 1);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f19947a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
