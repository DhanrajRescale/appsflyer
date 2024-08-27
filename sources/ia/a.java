package ia;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.j0;
import com.assetgro.stockgro.feature_market.presentation.fno.search.MarketOptionSearchActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import ni.o;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19747b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f19746a = i10;
        this.f19747b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem it) {
        boolean z10;
        String str;
        int i10 = this.f19746a;
        Boolean bool = null;
        String str2 = null;
        Object obj = this.f19747b;
        switch (i10) {
            case 0:
                b this$0 = (b) obj;
                int i11 = b.f19748h;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                j0 activity = this$0.getActivity();
                if (activity != null) {
                    Intent intent = new Intent(this$0.requireContext(), (Class<?>) MarketOptionSearchActivity.class);
                    Bundle arguments = this$0.getArguments();
                    if (arguments != null) {
                        z10 = arguments.getBoolean("CALL_FROM_PORTFOLIO");
                    } else {
                        z10 = true;
                    }
                    intent.putExtra("CALL_FROM_PORTFOLIO", z10);
                    Bundle arguments2 = this$0.getArguments();
                    if (arguments2 != null) {
                        str = arguments2.getString("PORTFOLIO_ID");
                    } else {
                        str = null;
                    }
                    intent.putExtra("PORTFOLIO_ID", str);
                    Bundle arguments3 = this$0.getArguments();
                    if (arguments3 != null) {
                        bool = Boolean.valueOf(arguments3.getBoolean("IS_MODEL"));
                    }
                    intent.putExtra("IS_MODEL", bool);
                    activity.startActivity(intent);
                }
                return true;
            case 1:
                NotificationsActivity this$02 = (NotificationsActivity) obj;
                int i12 = NotificationsActivity.f9619m;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = sf.b.f34606l;
                NotificationsViewModel notificationsViewModel = (NotificationsViewModel) this$02.x();
                Intrinsics.checkNotNullParameter(notificationsViewModel, "notificationsViewModel");
                Bundle bundle = new Bundle();
                sf.b bVar = new sf.b();
                bVar.setArguments(bundle);
                bVar.f34607i = notificationsViewModel;
                bVar.show(this$02.getSupportFragmentManager(), "NotificationsFilterBottomSheetDialogFragment");
                return true;
            default:
                o this$03 = (o) obj;
                int i14 = o.f28751j;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                j0 activity2 = this$03.getActivity();
                if (activity2 != null) {
                    Intent intent2 = new Intent(this$03.requireContext(), (Class<?>) MarketAssetSearchActivity.class);
                    Bundle arguments4 = this$03.getArguments();
                    if (arguments4 != null) {
                        str2 = arguments4.getString("PORTFOLIO_ID");
                    }
                    Bundle bundle2 = new Bundle();
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("ADD_TO_PORTFOLIO", activity2.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                    bundle3.putParcelable("PORTFOLIO", activity2.getIntent().getParcelableExtra("PORTFOLIO"));
                    bundle3.putBoolean("CALL_FROM_PORTFOLIO", activity2.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                    bundle3.putString("PORTFOLIO_ID", str2);
                    intent2.putExtras(bundle3);
                    intent2.putExtras(bundle2);
                    activity2.startActivityForResult(intent2, 10056);
                }
                return true;
        }
    }
}
