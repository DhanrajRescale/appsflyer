package qe;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ba.v3;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchActivity;
import com.assetgro.stockgro.ui.chat.search.SocialAdvancedSearchViewModel;
import kotlin.jvm.internal.Intrinsics;
import r3.k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SocialAdvancedSearchActivity f31899b;

    public /* synthetic */ b(SocialAdvancedSearchActivity socialAdvancedSearchActivity, int i10) {
        this.f31898a = i10;
        this.f31899b = socialAdvancedSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f31898a;
        SocialAdvancedSearchActivity this$0 = this.f31899b;
        switch (i10) {
            case 0:
                int i11 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return;
            case 1:
                int i12 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((v3) this$0.w()).f6373t.f4871u.performClick();
                return;
            case 2:
                int i13 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((v3) this$0.w()).f6373t.f4870t.performClick();
                return;
            case 3:
                int i14 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((v3) this$0.w()).f6373t.f4870t.performClick();
                return;
            case 4:
                int i15 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i16 = se.b.f34598j;
                Bundle bundle = new Bundle();
                se.b bVar = new se.b();
                bVar.setArguments(bundle);
                bVar.show(this$0.getSupportFragmentManager(), "ClearSearchHistoryBottomSheetFragment");
                return;
            case 5:
                int i17 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView view2 = ((v3) this$0.w()).f6373t.f4869s;
                Intrinsics.checkNotNullExpressionValue(view2, "chipAll");
                Intrinsics.checkNotNullParameter(view2, "view");
                view2.setBackground(k.getDrawable(this$0, R.drawable.background_social_search_chip_selected));
                TextView chipPeople = ((v3) this$0.w()).f6373t.f4871u;
                Intrinsics.checkNotNullExpressionValue(chipPeople, "chipPeople");
                this$0.N(chipPeople);
                TextView chipGroups = ((v3) this$0.w()).f6373t.f4870t;
                Intrinsics.checkNotNullExpressionValue(chipGroups, "chipGroups");
                this$0.N(chipGroups);
                SocialAdvancedSearchViewModel socialAdvancedSearchViewModel = (SocialAdvancedSearchViewModel) this$0.x();
                socialAdvancedSearchViewModel.f9437w = false;
                socialAdvancedSearchViewModel.f9438x = 0;
                socialAdvancedSearchViewModel.f9439y = 10;
                ((v3) this$0.w()).f6373t.E.setMyScrollChangeListener(null);
                ((SocialAdvancedSearchViewModel) this$0.x()).h(e.f31904b);
                return;
            case 6:
                int i18 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView view3 = ((v3) this$0.w()).f6373t.f4870t;
                Intrinsics.checkNotNullExpressionValue(view3, "chipGroups");
                Intrinsics.checkNotNullParameter(view3, "view");
                view3.setBackground(k.getDrawable(this$0, R.drawable.background_social_search_chip_selected));
                TextView chipPeople2 = ((v3) this$0.w()).f6373t.f4871u;
                Intrinsics.checkNotNullExpressionValue(chipPeople2, "chipPeople");
                this$0.N(chipPeople2);
                TextView chipAll = ((v3) this$0.w()).f6373t.f4869s;
                Intrinsics.checkNotNullExpressionValue(chipAll, "chipAll");
                this$0.N(chipAll);
                ((v3) this$0.w()).f6373t.E.setMyScrollChangeListener(new va.b(this$0, 4));
                ((SocialAdvancedSearchViewModel) this$0.x()).h(e.f31906d);
                return;
            default:
                int i19 = SocialAdvancedSearchActivity.f9423o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView view4 = ((v3) this$0.w()).f6373t.f4871u;
                Intrinsics.checkNotNullExpressionValue(view4, "chipPeople");
                Intrinsics.checkNotNullParameter(view4, "view");
                view4.setBackground(k.getDrawable(this$0, R.drawable.background_social_search_chip_selected));
                TextView chipGroups2 = ((v3) this$0.w()).f6373t.f4870t;
                Intrinsics.checkNotNullExpressionValue(chipGroups2, "chipGroups");
                this$0.N(chipGroups2);
                TextView chipAll2 = ((v3) this$0.w()).f6373t.f4869s;
                Intrinsics.checkNotNullExpressionValue(chipAll2, "chipAll");
                this$0.N(chipAll2);
                ((v3) this$0.w()).f6373t.E.setMyScrollChangeListener(new va.b(this$0, 4));
                ((SocialAdvancedSearchViewModel) this$0.x()).h(e.f31905c);
                return;
        }
    }
}
