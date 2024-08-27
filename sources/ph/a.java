package ph;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.fragment.app.j0;
import ba.jr;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CountrySelectDto;
import com.assetgro.stockgro.data.model.RedemptionOffer;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.redemption.offers.RedemptionOfferItemViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListActivity;
import com.assetgro.stockgro.ui.social.presentation.slider.ImageSliderActivity;
import com.assetgro.stockgro.ui.stock.detail.StockDetailFragment;
import com.assetgro.stockgro.ui.stock.list.StockItemViewModel;
import com.assetgro.stockgro.ui.stock.modify.cover.ModifyStockCoverOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.sell.ModifySellOrderFragment;
import com.assetgro.stockgro.ui.stock.search.MarketAssetSearchViewModel;
import com.assetgro.stockgro.ui.stock.sort.StockSortItemViewModel;
import com.assetgro.stockgro.ui.stock.v2.presentation.chart.StockTradingViewFullScreenChartActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionViewModel;
import com.assetgro.stockgro.ui.subscription.OtherSubscriptionPlansFragment;
import com.assetgro.stockgro.widget.MarketSlider;
import com.assetgro.stockgro.widget.MultipleCountryInputView;
import com.assetgro.stockgro.widget.PriceInputView;
import com.assetgro.stockgro.widget.mentionable_edit_text.MentionableEditText;
import ej.p;
import ej.r0;
import gd.m;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;
import ni.l;
import ni.s;
import nl.w0;
import qj.a0;
import qj.e0;
import qj.z;
import zi.k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31084b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f31083a = i10;
        this.f31084b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar;
        l lVar2;
        Object obj;
        k narrationUiData;
        a0 a0Var;
        int i10 = this.f31083a;
        AnalyticEvent analyticEvent = null;
        Object obj2 = this.f31084b;
        switch (i10) {
            case 0:
                b this$0 = (b) obj2;
                int i11 = b.f31085j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                return;
            case 1:
                e this$02 = (e) obj2;
                int i12 = e.f31087y;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                RedemptionOffer redemptionOffer = (RedemptionOffer) ((RedemptionOfferItemViewModel) this$02.v()).f9075c.getValue();
                if (redemptionOffer != null) {
                    i iVar = (i) this$02.f31088x;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(redemptionOffer, "redemptionOffer");
                    String id2 = redemptionOffer.getId();
                    Intent intent = new Intent(iVar.getActivity(), (Class<?>) OfferDetailsActivity.class);
                    intent.putExtra("COUPON_ID", id2);
                    iVar.startActivityForResult(intent, 10078);
                    return;
                }
                return;
            case 2:
                i this$03 = (i) obj2;
                int i13 = i.f31105h;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.requireActivity().finish();
                return;
            case 3:
                BlockedUserListActivity this$04 = (BlockedUserListActivity) obj2;
                int i14 = BlockedUserListActivity.f10120l;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.finish();
                return;
            case 4:
                ImageSliderActivity this$05 = (ImageSliderActivity) obj2;
                int i15 = ImageSliderActivity.f10130n;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.onBackPressed();
                return;
            case 5:
                StockDetailFragment this$06 = (StockDetailFragment) obj2;
                int i16 = StockDetailFragment.f10186j;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.requireActivity().finish();
                if (this$06.getActivity() instanceof gd.b) {
                    j0 activity = this$06.getActivity();
                    Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.base.BaseActivity<*, *>");
                    ((gd.b) activity).onBackPressed();
                    return;
                }
                return;
            case 6:
                ni.f this$07 = (ni.f) obj2;
                int i17 = ni.f.f28730z;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                StockDto stockDto = (StockDto) ((StockItemViewModel) this$07.v()).f9075c.getValue();
                if (stockDto != null && (lVar = this$07.f28732y) != null) {
                    lVar.c(stockDto);
                    return;
                }
                return;
            case 7:
                ni.i this$08 = (ni.i) obj2;
                int i18 = ni.i.f28736y;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                StockDto stockDto2 = (StockDto) ((StockItemViewModel) this$08.v()).f9075c.getValue();
                if (stockDto2 != null && (lVar2 = this$08.f28737x) != null) {
                    lVar2.c(stockDto2);
                    return;
                }
                return;
            case 8:
                ModifyStockCoverOrderFragment this$09 = (ModifyStockCoverOrderFragment) obj2;
                int i19 = ModifyStockCoverOrderFragment.f10316i;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                j0 activity2 = this$09.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            case 9:
                ModifySellOrderFragment this$010 = (ModifySellOrderFragment) obj2;
                int i20 = ModifySellOrderFragment.f10332i;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                j0 activity3 = this$010.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                    return;
                }
                return;
            case 10:
                ui.f this$011 = (ui.f) obj2;
                int i21 = ui.f.f37219h;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                ((MarketAssetSearchViewModel) this$011.r()).j();
                return;
            case 11:
                yi.c this$012 = (yi.c) obj2;
                int i22 = yi.c.f41647y;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                s sVar = (s) ((StockSortItemViewModel) this$012.v()).f9075c.getValue();
                if (sVar != null) {
                    this$012.f41648x.invoke(sVar);
                    return;
                }
                return;
            case 12:
                aj.c this$013 = (aj.c) obj2;
                int i23 = aj.c.f442c;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.dismiss();
                return;
            case 13:
                StockTradingViewFullScreenChartActivity this$014 = (StockTradingViewFullScreenChartActivity) obj2;
                int i24 = StockTradingViewFullScreenChartActivity.f10472l;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.onBackPressed();
                return;
            case 14:
                dj.g this$015 = (dj.g) obj2;
                int i25 = dj.g.f14397h;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                int i26 = i0.f24733j;
                kq.e.L(new ShowInfoData(this$015.getString(R.string.what_is_modeled_data_question), this$015.getString(R.string.what_is_modeled_data_answer), this$015.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$015.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
            case 15:
                OtherSubscriptionPlansFragment this$016 = (OtherSubscriptionPlansFragment) obj2;
                int i27 = OtherSubscriptionPlansFragment.f10518k;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                q6.l.h(this$016).p();
                return;
            case 16:
                p this$017 = (p) obj2;
                int i28 = p.f15521j;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.dismiss();
                Bundle arguments = this$017.getArguments();
                if (arguments != null) {
                    obj = arguments.getSerializable("ANALYTIC_EVENT");
                } else {
                    obj = null;
                }
                if (obj instanceof AnalyticEvent) {
                    analyticEvent = (AnalyticEvent) obj;
                }
                if (analyticEvent != null) {
                    Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
                    this$017.v(analyticEvent);
                    this$017.w(analyticEvent);
                }
                this$017.startActivity(new Intent(this$017.requireActivity(), (Class<?>) ManageSubscriptionActivity.class));
                return;
            case 17:
                r0 this$018 = (r0) obj2;
                int i29 = r0.f15534d;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.dismiss();
                ((ManageSubscriptionViewModel) this$018.f15536c.getValue()).f10501t.postValue(new j(Unit.f23355a));
                return;
            case 18:
                MarketSlider this$019 = (MarketSlider) obj2;
                int i30 = MarketSlider.f10647i;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                z zVar = this$019.marketData;
                if (zVar != null && (narrationUiData = zVar.f32080g) != null && (a0Var = this$019.onInfoTapListener) != null) {
                    bj.i iVar2 = (bj.i) a0Var;
                    int i31 = iVar2.f7012a;
                    bj.j jVar = iVar2.f7013b;
                    switch (i31) {
                        case 0:
                            Intrinsics.checkNotNullParameter(narrationUiData, "narrationUiData");
                            jVar.f7014x.invoke(narrationUiData);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(narrationUiData, "narrationUiData");
                            jVar.f7014x.invoke(narrationUiData);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(narrationUiData, "narrationUiData");
                            jVar.f7014x.invoke(narrationUiData);
                            return;
                    }
                }
                return;
            case 19:
                MultipleCountryInputView this$020 = (MultipleCountryInputView) obj2;
                int i32 = MultipleCountryInputView.D;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                e0 e0Var = this$020.onSecondaryActionClicked;
                if (e0Var != null) {
                    CountrySelectDto countrySelectDto = this$020.defaultCountry;
                    ab.k kVar = (ab.k) e0Var;
                    int i33 = kVar.f299a;
                    m mVar = kVar.f300b;
                    switch (i33) {
                        case 0:
                            Intrinsics.checkNotNullParameter(countrySelectDto, "countrySelectDto");
                            MobileLoginFragment mobileLoginFragment = (MobileLoginFragment) mVar;
                            if (mobileLoginFragment.H().h()) {
                                ab.c cVar = new ab.c();
                                cVar.setArguments(new Bundle(0));
                                cVar.show(mobileLoginFragment.getChildFragmentManager(), "CountrySelectBottomSheetFragment");
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(countrySelectDto, "countrySelectDto");
                            MobileRegisterFragment mobileRegisterFragment = (MobileRegisterFragment) mVar;
                            int i34 = MobileRegisterFragment.f8757j;
                            mobileRegisterFragment.J(countrySelectDto);
                            if (mobileRegisterFragment.H().h()) {
                                ab.c cVar2 = new ab.c();
                                cVar2.setArguments(new Bundle(0));
                                cVar2.show(mobileRegisterFragment.getChildFragmentManager(), "CountrySelectBottomSheetFragment");
                                return;
                            }
                            return;
                    }
                }
                return;
            case 20:
                PriceInputView this$021 = (PriceInputView) obj2;
                int i35 = PriceInputView.f10675z;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.o();
                return;
            case 21:
                rd.e eVar = (rd.e) ((MentionableEditText) obj2).f10760i;
                eVar.getClass();
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                jr this_apply = eVar.f33618a;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.D.setVisibility(8);
                return;
            case 22:
                w0 this$022 = (w0) obj2;
                int i36 = w0.f28951m;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.cancel();
                return;
            case 23:
                wl.i this$023 = (wl.i) obj2;
                int i37 = wl.i.f39198l;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.t();
                return;
            case 24:
                ((gm.a) obj2).f17496i.setError(null);
                return;
            case 25:
                zo.c cVar3 = (zo.c) obj2;
                EditText editText = cVar3.f42588i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    cVar3.q();
                    return;
                }
                return;
            case 26:
                ((zo.i) obj2).u();
                return;
            default:
                zo.s sVar2 = (zo.s) obj2;
                EditText editText2 = sVar2.f42684f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar2.f42684f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar2.f42684f.setTransformationMethod(null);
                    } else {
                        sVar2.f42684f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        sVar2.f42684f.setSelection(selectionEnd);
                    }
                    sVar2.q();
                    return;
                }
                return;
        }
    }
}
