package ig;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.compose.ui.platform.ComposeView;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailActivity;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import ib.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd.b f19966b;

    public /* synthetic */ a(gd.b bVar, int i10) {
        this.f19965a = i10;
        this.f19966b = bVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = this.f19965a;
        gd.b bVar = this.f19966b;
        switch (i10) {
            case 0:
                PortfolioDetailActivity this$0 = (PortfolioDetailActivity) bVar;
                int i11 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int itemId = menuItem.getItemId();
                if (itemId != R.id.menu_options_rename) {
                    if (itemId == R.id.menu_options_reset) {
                        int i12 = wg.b.f39065j;
                        Bundle y10 = hl.f.y(new Pair("PORTFOLIO_ID", ((PortfolioDetailViewModel) this$0.x()).f9782s));
                        Bundle bundle = new Bundle();
                        bundle.putAll(y10);
                        wg.b bVar2 = new wg.b();
                        bVar2.setArguments(bundle);
                        bVar2.show(this$0.getSupportFragmentManager(), "ResetPortfolioBottomSheetDialogFragment");
                    }
                } else {
                    int i13 = vg.c.f38040j;
                    Bundle y11 = hl.f.y(new Pair("PORTFOLIO_ID", ((PortfolioDetailViewModel) this$0.x()).f9782s));
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(y11);
                    vg.c cVar = new vg.c();
                    cVar.setArguments(bundle2);
                    cVar.show(this$0.getSupportFragmentManager(), "RenamePortfolioBottomSheetDialogFragment");
                }
                return true;
            case 1:
                PortfolioDetailActivity this$02 = (PortfolioDetailActivity) bVar;
                int i14 = PortfolioDetailActivity.f9774m;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (menuItem.getItemId() == R.id.menu_options_rename) {
                    int i15 = vg.c.f38040j;
                    Bundle extras = this$02.getIntent().getExtras();
                    Bundle bundle3 = new Bundle();
                    if (extras != null) {
                        bundle3.putAll(extras);
                    }
                    vg.c cVar2 = new vg.c();
                    cVar2.setArguments(bundle3);
                    cVar2.show(this$02.getSupportFragmentManager(), "RenamePortfolioBottomSheetDialogFragment");
                }
                return true;
            default:
                RiaProfileActivity this$03 = (RiaProfileActivity) bVar;
                int i16 = RiaProfileActivity.f8791m;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                int itemId2 = menuItem.getItemId();
                String str = null;
                int i17 = 0;
                if (itemId2 != R.id.menu_block_unblock_user) {
                    if (itemId2 == R.id.menu_report_user) {
                        Intent intent = new Intent(this$03, (Class<?>) ReportEntityActivity.class);
                        Intent intent2 = this$03.getIntent();
                        if (intent2 != null) {
                            str = intent2.getStringExtra("USER_NAME");
                        }
                        intent.putExtra("REPORT_USER_NAME", str);
                        intent.putExtra("USER_ID_TO_BE_REPORTED", ((RiaProfileViewModel) this$03.x()).f8804x);
                        intent.putExtra("ENTITY_TYPE_TO_BE_REPORTED", ReportEntityType.User);
                        intent.putExtra("IS_BLOCKED", false);
                        this$03.startActivity(intent);
                        return true;
                    }
                } else {
                    View findViewById = this$03.findViewById(android.R.id.content);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    Context context = viewGroup.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ComposeView composeView = new ComposeView(context, null, 6);
                    o oVar = new o(composeView, this$03, viewGroup, i17);
                    Object obj = b1.d.f3079a;
                    composeView.setContent(new b1.c(oVar, true, -629650597));
                    viewGroup.addView(composeView);
                }
                return false;
        }
    }
}
