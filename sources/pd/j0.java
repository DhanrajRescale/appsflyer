package pd;

import android.content.Intent;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupCreateHostActivityCompose f30920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(GroupCreateHostActivityCompose groupCreateHostActivityCompose, int i10) {
        super(1);
        this.f30919a = i10;
        this.f30920b = groupCreateHostActivityCompose;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f30919a;
        GroupCreateHostActivityCompose groupCreateHostActivityCompose = this.f30920b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = groupCreateHostActivityCompose.f17255c;
                    if (fVar != null) {
                        fVar.d();
                    }
                } else {
                    com.kaopiz.kprogresshud.f fVar2 = groupCreateHostActivityCompose.f17255c;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                }
                return Unit.f23355a;
            default:
                Intent intent = new Intent(groupCreateHostActivityCompose, (Class<?>) GroupDetailHostActivity.class);
                intent.putExtra("GROUP_CHAT_ID", ((Group) obj).getGroupId());
                groupCreateHostActivityCompose.startActivity(intent);
                groupCreateHostActivityCompose.finish();
                return Unit.f23355a;
        }
    }
}
