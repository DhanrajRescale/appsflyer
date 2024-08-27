package sf;

import android.view.View;
import android.widget.ImageView;
import ba.bg;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.assetgro.stockgro.ui.notifications.NotificationsViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import re.d;
import ub.f;
import vt.y;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsf/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/bg;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<ReusedBottomSheetViewModel, bg> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f34606l = 0;

    /* renamed from: i, reason: collision with root package name */
    public NotificationsViewModel f34607i;

    /* renamed from: j, reason: collision with root package name */
    public int f34608j;

    /* renamed from: k, reason: collision with root package name */
    public List f34609k;

    public final void B(int i10) {
        List list = this.f34609k;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 == i10) {
                    List list2 = this.f34609k;
                    if (list2 != null) {
                        ((ImageView) list2.get(i11)).setImageResource(R.drawable.ic_selected_state);
                    } else {
                        Intrinsics.k("checkBoxList");
                        throw null;
                    }
                } else {
                    List list3 = this.f34609k;
                    if (list3 != null) {
                        ((ImageView) list3.get(i11)).setImageResource(R.drawable.ic_unselected_state);
                    } else {
                        Intrinsics.k("checkBoxList");
                        throw null;
                    }
                }
            }
            return;
        }
        Intrinsics.k("checkBoxList");
        throw null;
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.k();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_bottom_sheet_notifications_filter;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        NotificationsViewModel notificationsViewModel = this.f34607i;
        if (notificationsViewModel != null) {
            notificationsViewModel.f9625o.observe(this, new d(21, new f(this, 21)));
        } else {
            Intrinsics.k("notificationsViewModel");
            throw null;
        }
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final int i10 = 0;
        ((bg) r()).f4287t.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b this$0 = this.f34605b;
                switch (i11) {
                    case 0:
                        int i12 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i13 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i14 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i15 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i11 = 1;
        ((bg) r()).A.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i12 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i13 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i14 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i15 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i12 = 2;
        ((bg) r()).f4290w.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i13 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i14 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i15 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i13 = 3;
        ((bg) r()).F.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i132 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i14 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i15 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i14 = 4;
        ((bg) r()).f4292y.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i14;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i132 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i142 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i15 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i15 = 5;
        ((bg) r()).C.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i15;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i132 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i142 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i152 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i16 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i16 = 6;
        ((bg) r()).D.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i16;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i132 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i142 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i152 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i162 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i17 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        final int i17 = 7;
        ((bg) r()).f4288u.setOnClickListener(new View.OnClickListener(this) { // from class: sf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f34605b;

            {
                this.f34605b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i17;
                b this$0 = this.f34605b;
                switch (i112) {
                    case 0:
                        int i122 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    case 1:
                        int i132 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 1;
                        this$0.B(1);
                        return;
                    case 2:
                        int i142 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 2;
                        this$0.B(2);
                        return;
                    case 3:
                        int i152 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 3;
                        this$0.B(3);
                        return;
                    case 4:
                        int i162 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 4;
                        this$0.B(4);
                        return;
                    case 5:
                        int i172 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 5;
                        this$0.B(5);
                        return;
                    case 6:
                        int i18 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f34608j = 0;
                        this$0.B(0);
                        return;
                    default:
                        int i19 = b.f34606l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NotificationsViewModel notificationsViewModel = this$0.f34607i;
                        if (notificationsViewModel != null) {
                            notificationsViewModel.f9625o.setValue(Integer.valueOf(this$0.f34608j));
                            this$0.dismiss();
                            return;
                        } else {
                            Intrinsics.k("notificationsViewModel");
                            throw null;
                        }
                }
            }
        });
        ImageView allCategoriesIcon = ((bg) r()).f4286s;
        Intrinsics.checkNotNullExpressionValue(allCategoriesIcon, "allCategoriesIcon");
        ImageView portfolioIcon = ((bg) r()).f4293z;
        Intrinsics.checkNotNullExpressionValue(portfolioIcon, "portfolioIcon");
        ImageView leagueIcon = ((bg) r()).f4289v;
        Intrinsics.checkNotNullExpressionValue(leagueIcon, "leagueIcon");
        ImageView socialIcon = ((bg) r()).E;
        Intrinsics.checkNotNullExpressionValue(socialIcon, "socialIcon");
        ImageView paymentIcon = ((bg) r()).f4291x;
        Intrinsics.checkNotNullExpressionValue(paymentIcon, "paymentIcon");
        ImageView profileIcon = ((bg) r()).B;
        Intrinsics.checkNotNullExpressionValue(profileIcon, "profileIcon");
        this.f34609k = y.g(allCategoriesIcon, portfolioIcon, leagueIcon, socialIcon, paymentIcon, profileIcon);
        NotificationsViewModel notificationsViewModel = this.f34607i;
        if (notificationsViewModel != null) {
            Integer num = (Integer) notificationsViewModel.f9625o.getValue();
            if (num == null) {
                num = 0;
            }
            B(num.intValue());
            return;
        }
        Intrinsics.k("notificationsViewModel");
        throw null;
    }
}
