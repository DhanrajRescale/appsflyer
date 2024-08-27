package lf;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ba.ci;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.bottomSheet.EmptyBottomSheetViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llf/i0;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/chat/detail/group/info/bottomSheet/EmptyBottomSheetViewModel;", "Lba/ci;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i0 extends gd.h<EmptyBottomSheetViewModel, ci> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f24733j = 0;

    /* renamed from: i, reason: collision with root package name */
    public ShowInfoData f24734i;

    @Override // gd.h, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new ha.s(2));
        }
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.e();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_info_bottom_sheet_fragment;
    }

    @Override // gd.h
    public final void z(View view) {
        ShowInfoData showInfoData;
        String str;
        String str2;
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("DATA", ShowInfoData.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("DATA");
                if (!(parcelable3 instanceof ShowInfoData)) {
                    parcelable3 = null;
                }
                parcelable = (ShowInfoData) parcelable3;
            }
            showInfoData = (ShowInfoData) parcelable;
        } else {
            showInfoData = null;
        }
        this.f24734i = showInfoData;
        final int i10 = 0;
        ((ci) r()).f4374s.setOnClickListener(new View.OnClickListener(this) { // from class: lf.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f24730b;

            {
                this.f24730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                i0 this$0 = this.f24730b;
                switch (i11) {
                    case 0:
                        int i12 = i0.f24733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = i0.f24733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((ci) r()).f4375t.setOnClickListener(new View.OnClickListener(this) { // from class: lf.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f24730b;

            {
                this.f24730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                i0 this$0 = this.f24730b;
                switch (i112) {
                    case 0:
                        int i12 = i0.f24733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = i0.f24733j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        ShowInfoData showInfoData2 = this.f24734i;
        if (showInfoData2 != null && showInfoData2.getShowDefaultIcon()) {
            ImageView infoHomeIcon = ((ci) r()).f4377v;
            Intrinsics.checkNotNullExpressionValue(infoHomeIcon, "infoHomeIcon");
            zq.f.m0(infoHomeIcon);
        } else {
            ImageView infoHomeIcon2 = ((ci) r()).f4377v;
            Intrinsics.checkNotNullExpressionValue(infoHomeIcon2, "infoHomeIcon");
            zq.f.M(infoHomeIcon2);
        }
        ShowInfoData showInfoData3 = this.f24734i;
        if (showInfoData3 != null) {
            ((ci) r()).f4377v.setImageResource(showInfoData3.getInfoIcon());
        }
        ShowInfoData showInfoData4 = this.f24734i;
        if (showInfoData4 != null) {
            ((ci) r()).f4375t.setImageResource(showInfoData4.getCloseIcon());
        }
        ShowInfoData showInfoData5 = this.f24734i;
        if (showInfoData5 != null && showInfoData5.getTitle() != null) {
            TextView title = ((ci) r()).f4378w;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            zq.f.m0(title);
            ci ciVar = (ci) r();
            ShowInfoData showInfoData6 = this.f24734i;
            if (showInfoData6 != null) {
                str2 = showInfoData6.getTitle();
            } else {
                str2 = null;
            }
            ciVar.f4378w.setText(str2);
        }
        ShowInfoData showInfoData7 = this.f24734i;
        if (showInfoData7 != null && showInfoData7.getContent() != null) {
            TextView content = ((ci) r()).f4376u;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            zq.f.m0(content);
            ci ciVar2 = (ci) r();
            ShowInfoData showInfoData8 = this.f24734i;
            if (showInfoData8 == null || (str = showInfoData8.getContent()) == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            ciVar2.f4376u.setText(b4.d.a(str, 0));
        }
        ShowInfoData showInfoData9 = this.f24734i;
        if (showInfoData9 != null && showInfoData9.getButtonText() != null) {
            MaterialButton button = ((ci) r()).f4374s;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            zq.f.m0(button);
            ci ciVar3 = (ci) r();
            ShowInfoData showInfoData10 = this.f24734i;
            if (showInfoData10 != null) {
                str3 = showInfoData10.getButtonText();
            }
            ciVar3.f4374s.setText(str3);
        }
    }
}
