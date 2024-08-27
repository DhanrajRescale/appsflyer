package td;

import android.widget.Toast;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoActivity f35828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GroupInfoActivity groupInfoActivity, int i10) {
        super(1);
        this.f35827a = i10;
        this.f35828b = groupInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GroupInfoActivity groupInfoActivity = this.f35828b;
        int i10 = this.f35827a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        groupInfoActivity.setResult(0);
                        groupInfoActivity.finish();
                        break;
                    default:
                        Toast.makeText(groupInfoActivity, groupInfoActivity.getString(R.string.reported_successfully), 0).show();
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        groupInfoActivity.setResult(0);
                        groupInfoActivity.finish();
                        break;
                    default:
                        Toast.makeText(groupInfoActivity, groupInfoActivity.getString(R.string.reported_successfully), 0).show();
                        break;
                }
                return Unit.f23355a;
        }
    }
}
