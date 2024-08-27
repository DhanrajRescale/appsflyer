package ye;

import android.content.Intent;
import ba.a1;
import com.assetgro.stockgro.ui.drawer.invite.InviteActivity;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InviteActivity f41600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(InviteActivity inviteActivity, int i10) {
        super(1);
        this.f41599a = i10;
        this.f41600b = inviteActivity;
    }

    public final void a(String str) {
        int i10 = this.f41599a;
        InviteActivity inviteActivity = this.f41600b;
        switch (i10) {
            case 0:
                ((a1) inviteActivity.w()).f4150u.setText(str);
                return;
            default:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setType("text/plain");
                inviteActivity.f9487k = intent;
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41599a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            case 1:
                a((String) obj);
                return Unit.f23355a;
            default:
                ((a1) this.f41600b.w()).f4152w.setVisibility(0);
                return Unit.f23355a;
        }
    }
}
