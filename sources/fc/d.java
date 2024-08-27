package fc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u0;
import ba.jk;
import ba.ls;
import ba.oq;
import com.assetgro.stockgro.missions.domain.model.CTA;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailFragment;
import com.assetgro.stockgro.missions.presentation.detail.MissionTaskDetailViewModel;
import com.assetgro.stockgro.missions.presentation.widget.MissionDetailCTAWidget;
import com.assetgro.stockgro.prod.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.y;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MissionTaskDetailFragment f16009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MissionTaskDetailFragment missionTaskDetailFragment, int i10) {
        super(1);
        this.f16008a = i10;
        this.f16009b = missionTaskDetailFragment;
    }

    public final void a(MissionDetail missionDetail) {
        boolean z10;
        Unit unit;
        Unit unit2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unit unit3;
        int i15;
        MissionDetail missionDetail2;
        String status;
        final int i16 = 1;
        final int i17 = 0;
        int i18 = this.f16008a;
        MissionTaskDetailFragment missionTaskDetailFragment = this.f16009b;
        switch (i18) {
            case 1:
                MissionStatus missionStatus = yk.j.Z0(missionDetail.getStatus());
                int i19 = MissionTaskDetailFragment.f8859j;
                ConstraintLayout missionBannerContainer = ((jk) missionTaskDetailFragment.q()).f5151u;
                Intrinsics.checkNotNullExpressionValue(missionBannerContainer, "missionBannerContainer");
                missionTaskDetailFragment.F(missionBannerContainer);
                ((jk) missionTaskDetailFragment.q()).f5150t.setMissionData(missionDetail);
                final MissionDetailCTAWidget missionDetailCTAWidget = ((jk) missionTaskDetailFragment.q()).f5152v;
                missionDetailCTAWidget.setVisibility(0);
                final CTA j10 = MissionTaskDetailViewModel.j(missionDetail);
                final CTA k10 = MissionTaskDetailViewModel.k(missionDetail);
                MissionTaskDetailViewModel missionTaskDetailViewModel = (MissionTaskDetailViewModel) missionTaskDetailFragment.r();
                Intrinsics.checkNotNullParameter(missionDetail, "missionDetail");
                if (missionDetail.getStatus().length() == 0 && missionTaskDetailViewModel.l()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ls lsVar = missionDetailCTAWidget.f8930a;
                if (j10 != null) {
                    lsVar.f27491e.setVisibility(0);
                    lsVar.f5394s.setText(j10.getName());
                    missionDetailCTAWidget.setEnablePrimaryButton(z10);
                    unit = Unit.f23355a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    lsVar.f27491e.setVisibility(8);
                }
                if (k10 != null) {
                    lsVar.f5395t.setVisibility(0);
                    lsVar.f5395t.setText(k10.getName());
                    unit2 = Unit.f23355a;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    lsVar.f5395t.setVisibility(8);
                }
                lsVar.f5394s.setOnClickListener(new View.OnClickListener() { // from class: jc.a
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
                    
                        if (r5.equals("alphanumeric") == false) goto L55;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b7, code lost:
                    
                        if (r2.getInputValue().length() != 0) goto L76;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b9, code lost:
                    
                        r2.setErrorText(true);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bd, code lost:
                    
                        r2.setErrorText(false);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
                    
                        if (r5.equals("numeric") == false) goto L55;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
                    
                        if (r5.equals("text_input") == false) goto L55;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r10) {
                        /*
                            Method dump skipped, instructions count: 510
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: jc.a.onClick(android.view.View):void");
                    }
                });
                lsVar.f5395t.setOnClickListener(new View.OnClickListener() { // from class: jc.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            Method dump skipped, instructions count: 510
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: jc.a.onClick(android.view.View):void");
                    }
                });
                oq oqVar = ((jk) missionTaskDetailFragment.q()).f5149s.f5932t;
                TextView title = oqVar.A;
                Intrinsics.checkNotNullExpressionValue(title, "title");
                Intrinsics.checkNotNullParameter(title, "<this>");
                Intrinsics.checkNotNullParameter(missionStatus, "missionStatus");
                MissionStatus missionStatus2 = MissionStatus.NOT_STARTED;
                MissionStatus missionStatus3 = MissionStatus.UNDER_REVIEW;
                MissionStatus missionStatus4 = MissionStatus.FAILED;
                if (y.c(missionStatus2, missionStatus3, missionStatus4).contains(missionStatus)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                title.setVisibility(i10);
                int[] iArr = ic.a.f19841a;
                int i20 = iArr[missionStatus.ordinal()];
                if (i20 != 1) {
                    if (i20 == 2 || i20 == 3 || i20 == 4) {
                        i11 = R.color.grey_A0A0A0;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = R.color.black_3A3A3A;
                }
                a3.a.s(title, i11);
                TextView subTitle = oqVar.f5689z;
                Intrinsics.checkNotNullExpressionValue(subTitle, "subTitle");
                Intrinsics.checkNotNullParameter(subTitle, "<this>");
                Intrinsics.checkNotNullParameter(missionStatus, "missionStatus");
                if (y.c(missionStatus2, missionStatus3, missionStatus4).contains(missionStatus)) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                subTitle.setVisibility(i12);
                int i21 = iArr[missionStatus.ordinal()];
                if (i21 != 1) {
                    if (i21 == 2 || i21 == 3 || i21 == 4) {
                        i13 = R.color.grey_A0A0A0;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i13 = R.color.black_3A3A3A;
                }
                a3.a.s(subTitle, i13);
                View view = oqVar.f5683t.f27491e;
                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                Intrinsics.checkNotNullParameter(view, "<this>");
                Intrinsics.checkNotNullParameter(missionStatus, "missionStatus");
                if (y.c(missionStatus2, missionStatus4, missionStatus3).contains(missionStatus)) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                view.setVisibility(i14);
                missionTaskDetailFragment.H(!((MissionTaskDetailViewModel) missionTaskDetailFragment.r()).n());
                MissionTaskDetailViewModel missionTaskDetailViewModel2 = (MissionTaskDetailViewModel) missionTaskDetailFragment.r();
                if (missionTaskDetailViewModel2.l() && !missionTaskDetailViewModel2.n()) {
                    MissionDetail missionDetail3 = (MissionDetail) ((MissionTaskDetailViewModel) missionTaskDetailFragment.r()).f8864o.getValue();
                    if (missionDetail3 != null && missionDetail3.getInputTypeDetails() != null) {
                        View view2 = ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f27491e;
                        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        Intrinsics.checkNotNullParameter(missionStatus, "missionStatus");
                        if (y.c(missionStatus2).contains(missionStatus)) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        view2.setVisibility(i15);
                        missionTaskDetailFragment.H(false);
                        unit3 = Unit.f23355a;
                    } else {
                        unit3 = null;
                    }
                    if (unit3 == null) {
                        ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f27491e.setVisibility(8);
                    }
                    ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f6678u.getEditText().setOnFocusChangeListener(new a(missionTaskDetailFragment, 0));
                    ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f6678u.setOnInputViewAction(new c(missionTaskDetailFragment));
                } else {
                    ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f27491e.setVisibility(8);
                }
                ((jk) missionTaskDetailFragment.q()).f5151u.post(new androidx.activity.b(missionTaskDetailFragment, 23));
                return;
            default:
                MissionTaskDetailViewModel missionTaskDetailViewModel3 = (MissionTaskDetailViewModel) missionTaskDetailFragment.r();
                if (!missionTaskDetailViewModel3.f8871v && (missionDetail2 = (MissionDetail) missionTaskDetailViewModel3.f8864o.getValue()) != null && (status = missionDetail2.getStatus()) != null && yk.j.Z0(status) == MissionStatus.UNDER_REVIEW) {
                    missionTaskDetailViewModel3.f8871v = false;
                    fd.c cVar = missionTaskDetailViewModel3.f8872w;
                    if (cVar != null) {
                        cVar.a();
                        missionTaskDetailViewModel3.f8871v = true;
                        yk.g.H(u0.f(missionTaskDetailViewModel3), null, null, new n(missionTaskDetailViewModel3, null), 3);
                        return;
                    }
                    Intrinsics.k("refreshTimer");
                    throw null;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f16008a;
        MissionTaskDetailFragment missionTaskDetailFragment = this.f16009b;
        switch (i10) {
            case 2:
                Intrinsics.c(str);
                kj.f.k(missionTaskDetailFragment, str);
                return;
            case 3:
            case 4:
            default:
                ImageView rewardIcon = ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5682s.f5890t;
                Intrinsics.checkNotNullExpressionValue(rewardIcon, "rewardIcon");
                Intrinsics.c(str);
                kp.j.Y(rewardIcon, str);
                return;
            case 5:
                if (str != null && str.length() != 0) {
                    ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f6678u.setHint(str);
                    return;
                }
                return;
            case 6:
                if (str != null) {
                    ((jk) missionTaskDetailFragment.q()).f5149s.f5932t.f5684u.f6678u.setInputViewType(str);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.kaopiz.kprogresshud.f fVar;
        int i10 = this.f16008a;
        MissionTaskDetailFragment missionTaskDetailFragment = this.f16009b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    com.kaopiz.kprogresshud.f fVar2 = missionTaskDetailFragment.f17283a;
                    if (fVar2 != null) {
                        fVar2.d();
                    }
                } else if (Intrinsics.a(bool, Boolean.FALSE) && (fVar = missionTaskDetailFragment.f17283a) != null) {
                    fVar.b();
                }
                return Unit.f23355a;
            case 1:
                a((MissionDetail) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                Context context = missionTaskDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = missionTaskDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            case 4:
                q6.l.h(missionTaskDetailFragment).p();
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                a((MissionDetail) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
