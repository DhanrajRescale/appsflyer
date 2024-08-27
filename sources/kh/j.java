package kh;

import android.view.View;
import ba.xb;
import com.assetgro.stockgro.data.model.RecentPerformance;
import k7.y1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends y1 {

    /* renamed from: u, reason: collision with root package name */
    public final xb f23146u;

    /* renamed from: v, reason: collision with root package name */
    public final Function2 f23147v;

    /* renamed from: w, reason: collision with root package name */
    public final hu.c f23148w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(final k kVar, xb binding, be.b onProfileViewRequest, v.g onPortfolioViewRequest) {
        super(binding.f27491e);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onProfileViewRequest, "onProfileViewRequest");
        Intrinsics.checkNotNullParameter(onPortfolioViewRequest, "onPortfolioViewRequest");
        this.f23146u = binding;
        this.f23147v = onProfileViewRequest;
        this.f23148w = onPortfolioViewRequest;
        final int i10 = 0;
        binding.f6643v.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i11 = i10;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        binding.f6645x.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i112 = i11;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        binding.E.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i112 = i12;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 3;
        binding.F.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i112 = i13;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 4;
        binding.C.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i112 = i14;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 5;
        binding.D.setOnClickListener(new View.OnClickListener(this) { // from class: kh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f23144b;

            {
                this.f23144b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentPerformance recentPerformance;
                RecentPerformance recentPerformance2;
                RecentPerformance recentPerformance3;
                RecentPerformance recentPerformance4;
                RecentPerformance recentPerformance5;
                RecentPerformance recentPerformance6;
                int i112 = i15;
                Integer num = null;
                k this$1 = kVar;
                j this$0 = this.f23144b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf = Integer.valueOf(this$0.d());
                        if (valueOf.intValue() != -1) {
                            num = valueOf;
                        }
                        if (num != null && (recentPerformance = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance.getUser().getUserId(), recentPerformance.getUser().getName());
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf2 = Integer.valueOf(this$0.d());
                        if (valueOf2.intValue() != -1) {
                            num = valueOf2;
                        }
                        if (num != null && (recentPerformance2 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance2.getUser().getUserId(), recentPerformance2.getUser().getName());
                            return;
                        }
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf3 = Integer.valueOf(this$0.d());
                        if (valueOf3.intValue() != -1) {
                            num = valueOf3;
                        }
                        if (num != null && (recentPerformance3 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance3.getWinner().getUserId(), recentPerformance3.getWinner().getName());
                            return;
                        }
                        return;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf4 = Integer.valueOf(this$0.d());
                        if (valueOf4.intValue() != -1) {
                            num = valueOf4;
                        }
                        if (num != null && (recentPerformance4 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23147v.invoke(recentPerformance4.getWinner().getUserId(), recentPerformance4.getWinner().getName());
                            return;
                        }
                        return;
                    case 4:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf5 = Integer.valueOf(this$0.d());
                        if (valueOf5.intValue() != -1) {
                            num = valueOf5;
                        }
                        if (num != null && (recentPerformance5 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance5, recentPerformance5.getUser().getUserImageUrl(), h.f23141b);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(this$1, "this$1");
                        Integer valueOf6 = Integer.valueOf(this$0.d());
                        if (valueOf6.intValue() != -1) {
                            num = valueOf6;
                        }
                        if (num != null && (recentPerformance6 = (RecentPerformance) this$1.q(num.intValue())) != null) {
                            this$0.f23148w.b(recentPerformance6, recentPerformance6.getWinner().getUserImageUrl(), h.f23140a);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
