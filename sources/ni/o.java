package ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.recyclerview.widget.RecyclerView;
import ba.co;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.data.repository.SortDirection;
import com.assetgro.stockgro.data.repository.SortOption;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.TopChartsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import com.assetgro.stockgro.widget.ArrowSlider;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.k0;
import ea.n0;
import iu.a0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lni/o;", "Lgd/i;", "Lcom/assetgro/stockgro/ui/stock/list/StockListViewModel;", "Lba/co;", "Lni/l;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends gd.i<StockListViewModel, co> implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28751j = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f28752g;

    /* renamed from: h, reason: collision with root package name */
    public FirebaseAnalytics f28753h;

    /* renamed from: i, reason: collision with root package name */
    public a f28754i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_stock_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((StockListViewModel) r()).f10255p.observe(this, new li.c(7, new n(this, 0)));
        ((StockListViewModel) r()).f9084g.observe(this, new li.c(7, new n(this, 1)));
        ((StockListViewModel) r()).f10256q.observe(this, new li.c(7, new n(this, 2)));
        ((StockListViewModel) r()).f10257r.observe(this, new li.c(7, new n(this, 3)));
        ((StockListViewModel) r()).f10264y.observe(this, new li.c(7, new n(this, 4)));
        ((StockListViewModel) r()).f10265z.observe(this, new li.c(7, new n(this, 5)));
        MainSharedViewModel mainSharedViewModel = this.f28752g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.f9593x.observe(this, new li.c(7, new n(this, 6)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        Object obj;
        boolean z13;
        h.m mVar;
        String string;
        String string2;
        h.m mVar2;
        Intrinsics.checkNotNullParameter(view, "view");
        StockListViewModel stockListViewModel = (StockListViewModel) r();
        Bundle arguments = getArguments();
        final int i10 = 0;
        if (arguments != null) {
            z10 = arguments.getBoolean("CALLED_FROM_HOME_SCREEN");
        } else {
            z10 = false;
        }
        stockListViewModel.C = z10;
        StockListViewModel stockListViewModel2 = (StockListViewModel) r();
        Bundle arguments2 = getArguments();
        final int i11 = 1;
        if (arguments2 != null) {
            z11 = arguments2.getBoolean("SHOW_INDEX_MENU");
        } else {
            z11 = true;
        }
        stockListViewModel2.D = z11;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z12 = arguments3.containsKey("SORT_ORDER");
        } else {
            z12 = false;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("SELECTED_INDEX")) == null) {
            str = "nifty_50";
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            obj = arguments5.getParcelable("LIST_DATA");
        } else {
            obj = null;
        }
        if (obj instanceof ArrayList) {
        }
        setHasOptionsMenu(true);
        StockListViewModel stockListViewModel3 = (StockListViewModel) r();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        stockListViewModel3.f10263x = str;
        I(z12);
        if (z12) {
            ((co) q()).f4395s.f6288t.setVisibility(8);
        } else {
            ((co) q()).f4395s.f6288t.setVisibility(0);
            ((co) q()).f4395s.f6288t.setOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    o this$0 = this.f28748b;
                    switch (i12) {
                        case 0:
                            int i13 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i14 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i15 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            z13 = arguments6.getBoolean("CALL_FROM_PORTFOLIO");
        } else {
            z13 = false;
        }
        if (!z13 && !z12) {
            ((co) q()).f4396t.setVisibility(0);
            ((co) q()).f4397u.setVisibility(8);
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (string2 = arguments7.getString("TITLE")) == null) {
                string2 = getString(R.string.stocks);
            }
            Intrinsics.c(string2);
            ((co) q()).f4396t.setTitle(string2);
            ((co) q()).f4396t.setTitleTextColor(r3.k.getColor(requireContext(), R.color.white));
            Toolbar toolbar = ((co) q()).f4396t;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            p(toolbar);
            j0 activity = getActivity();
            if (activity instanceof h.m) {
                mVar2 = (h.m) activity;
            } else {
                mVar2 = null;
            }
            if (mVar2 != null) {
                mVar2.u(((co) q()).f4396t);
            }
        } else {
            ((co) q()).f4397u.setVisibility(0);
            ((co) q()).f4396t.setVisibility(8);
            if (z12) {
                co coVar = (co) q();
                Bundle arguments8 = getArguments();
                if (arguments8 == null || (string = arguments8.getString("TITLE")) == null) {
                    string = getString(R.string.stocks);
                }
                coVar.f4397u.setTitle(string);
            } else {
                ((co) q()).f4397u.setTitle(getString(R.string.text_add_stocks));
            }
            Toolbar toolbarTwo = ((co) q()).f4397u;
            Intrinsics.checkNotNullExpressionValue(toolbarTwo, "toolbarTwo");
            p(toolbarTwo);
            ((co) q()).f4397u.setTitleTextColor(r3.k.getColor(requireContext(), R.color.white));
            j0 activity2 = getActivity();
            if (activity2 instanceof h.m) {
                mVar = (h.m) activity2;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                mVar.u(((co) q()).f4397u);
            }
        }
        if (!z13 && !z12) {
            Toolbar toolbar2 = ((co) q()).f4396t;
            toolbar2.setNavigationIcon(R.drawable.ic_menu_new);
            final int i12 = 2;
            toolbar2.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i12;
                    o this$0 = this.f28748b;
                    switch (i122) {
                        case 0:
                            int i13 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i14 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i15 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
        } else {
            Toolbar toolbar3 = ((co) q()).f4397u;
            toolbar3.setNavigationIcon(R.drawable.ic_back);
            toolbar3.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i11;
                    o this$0 = this.f28748b;
                    switch (i122) {
                        case 0:
                            int i13 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i14 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i15 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f28754i = new a(lifecycle, this);
        androidx.lifecycle.o lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        new a(lifecycle2, this);
        RecyclerView recyclerView = ((co) q()).f4395s.f6290v;
        a aVar = this.f28754i;
        if (aVar != null) {
            recyclerView.setAdapter(aVar);
            ((co) q()).f4395s.f6291w.setOnRefreshListener(new ta.d(this, z12, 1));
            final int i13 = 3;
            ((co) q()).f4395s.f6287s.getNext().setOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i13;
                    o this$0 = this.f28748b;
                    switch (i122) {
                        case 0:
                            int i132 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i14 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i15 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            final int i14 = 4;
            ((co) q()).f4395s.f6287s.getPrev().setOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i14;
                    o this$0 = this.f28748b;
                    switch (i122) {
                        case 0:
                            int i132 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i142 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i15 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            new ArrayAdapter(requireContext(), R.layout.layout_spinner_selected, ((StockListViewModel) r()).f10259t).setDropDownViewResource(R.layout.layout_custom_spinner);
            H();
            ArrowSlider pagerView = ((co) q()).f4395s.f6287s;
            Intrinsics.checkNotNullExpressionValue(pagerView, "pagerView");
            t(pagerView);
            byte[] bArr = kj.a.f23206a;
            if (kj.a.f23207b) {
                ((co) q()).f4395s.f6289u.setVisibility(8);
            } else {
                ((co) q()).f4395s.f6289u.setVisibility(0);
            }
            final int i15 = 5;
            ((co) q()).f4395s.f6289u.setOnClickListener(new View.OnClickListener(this) { // from class: ni.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f28748b;

                {
                    this.f28748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i122 = i15;
                    o this$0 = this.f28748b;
                    switch (i122) {
                        case 0:
                            int i132 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Bundle bundle = new Bundle();
                            yi.b bVar = new yi.b();
                            bVar.setArguments(bundle);
                            bVar.show(this$0.getChildFragmentManager(), "SortStockBottomSheetDialogFragment");
                            return;
                        case 1:
                            int i142 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        case 2:
                            int i152 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            MainSharedViewModel mainSharedViewModel = this$0.f28752g;
                            if (mainSharedViewModel != null) {
                                mainSharedViewModel.f9587r.postValue(Boolean.TRUE);
                                return;
                            } else {
                                Intrinsics.k("mainSharedViewModel");
                                throw null;
                            }
                        case 3:
                            int i16 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u < ((StockListViewModel) this$0.r()).f10261v) {
                                ((StockListViewModel) this$0.r()).f10260u++;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        case 4:
                            int i17 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (((StockListViewModel) this$0.r()).f10260u > 0) {
                                StockListViewModel stockListViewModel4 = (StockListViewModel) this$0.r();
                                stockListViewModel4.f10260u--;
                                ((StockListViewModel) this$0.r()).i();
                                return;
                            }
                            return;
                        default:
                            int i18 = o.f28751j;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            int i19 = i0.f24733j;
                            kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                            return;
                    }
                }
            });
            return;
        }
        Intrinsics.k("stockAdapter");
        throw null;
    }

    public final void H() {
        StockListViewModel stockListViewModel = (StockListViewModel) r();
        stockListViewModel.f10260u = 1;
        stockListViewModel.f10261v = 1;
        stockListViewModel.f10258s.clear();
        ((co) q()).f4395s.f6287s.getPrev().setVisibility(4);
        ((co) q()).f4395s.f6287s.getNext().setVisibility(0);
    }

    public final void I(boolean z10) {
        String str;
        if (z10) {
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("SORT_ORDER")) == null) {
                str = "PERCENT_DESC";
            }
            switch (str.hashCode()) {
                case -2117384923:
                    if (str.equals("TRENDING")) {
                        StockListViewModel stockListViewModel = (StockListViewModel) r();
                        s sVar = new s(SortOption.Trending, SortDirection.Descending, R.string.trending_descending);
                        Intrinsics.checkNotNullParameter(sVar, "<set-?>");
                        stockListViewModel.B = sVar;
                        H();
                        ((StockListViewModel) r()).i();
                        return;
                    }
                    return;
                case -952653604:
                    if (str.equals("FT_WEEK_HIGH")) {
                        ((StockListViewModel) r()).h("FT_WEEK_HIGH");
                        return;
                    }
                    return;
                case -810883302:
                    if (str.equals("volume")) {
                        StockListViewModel stockListViewModel2 = (StockListViewModel) r();
                        s sVar2 = new s(SortOption.Volume, SortDirection.Descending, R.string.volume_descending);
                        Intrinsics.checkNotNullParameter(sVar2, "<set-?>");
                        stockListViewModel2.B = sVar2;
                        H();
                        ((StockListViewModel) r()).i();
                        return;
                    }
                    return;
                case -653163721:
                    if (str.equals("PERCENT_ASC")) {
                        StockListViewModel stockListViewModel3 = (StockListViewModel) r();
                        s sVar3 = new s(SortOption.Percentage, SortDirection.Ascending, R.string.percentage_ascending);
                        Intrinsics.checkNotNullParameter(sVar3, "<set-?>");
                        stockListViewModel3.B = sVar3;
                        H();
                        ((StockListViewModel) r()).i();
                        return;
                    }
                    return;
                case -307821382:
                    if (str.equals("FT_WEEK_LOW")) {
                        ((StockListViewModel) r()).h("FT_WEEK_LOW");
                        return;
                    }
                    return;
                case 1226837611:
                    if (str.equals("PERCENT_DESC")) {
                        StockListViewModel stockListViewModel4 = (StockListViewModel) r();
                        s sVar4 = new s(SortOption.Percentage, SortDirection.Descending, R.string.percentage_descending);
                        Intrinsics.checkNotNullParameter(sVar4, "<set-?>");
                        stockListViewModel4.B = sVar4;
                        H();
                        ((StockListViewModel) r()).i();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        ((StockListViewModel) r()).i();
    }

    @Override // ni.l
    public final void c(StockDto stockDto) {
        String str;
        Intrinsics.checkNotNullParameter(stockDto, "stockDto");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("PORTFOLIO_ID");
        } else {
            str = null;
        }
        FirebaseAnalytics firebaseAnalytics = this.f28753h;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a("stock_detail", (Bundle) new ll.o(12, 0).f24937b);
            j0 activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                bundle.putString("STOCK_NAME", stockDto.getCode());
                bundle.putParcelable("STOCK", stockDto);
                bundle.putString("PORTFOLIO_ID", str);
                intent.putExtras(bundle);
                requireActivity().startActivityForResult(intent, 10016);
                jt.e eVar = ((StockListViewModel) r()).A;
                if (eVar != null) {
                    ft.b.b(eVar);
                    return;
                }
                return;
            }
            return;
        }
        Intrinsics.k("firebaseAnalytics");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        j0 activity;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10056 && i11 == -1 && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // gd.i, androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        boolean z10;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        boolean z11 = false;
        if (arguments != null) {
            z10 = arguments.getBoolean("CALL_FROM_PORTFOLIO");
        } else {
            z10 = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z11 = arguments2.containsKey("SORT_ORDER");
        }
        if (!z10 && !z11) {
            super.onCreateOptionsMenu(menu, inflater);
        } else if (!((StockListViewModel) r()).C) {
            inflater.inflate(R.menu.toolbar_menu_stocks, menu);
            MenuItem findItem = menu.findItem(R.id.action_search_placeholder);
            findItem.setVisible(true);
            findItem.setOnMenuItemClickListener(new ia.a(this, 2));
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        super.onPause();
        jt.e eVar = ((StockListViewModel) r()).A;
        if (eVar != null) {
            ft.b.b(eVar);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("DATA", false)) {
            ((StockListViewModel) r()).j();
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        StockRepository stockRepository = bVar.l();
        yk.g.i(stockRepository);
        TopChartsRepository topChartsRepository = (TopChartsRepository) bVar.f14269u.get();
        yk.g.i(topChartsRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(topChartsRepository, "topChartsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(StockListViewModel.class), new k0(k10, c10, stockRepository, topChartsRepository, userRepository));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, StockListViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockListViewModel.class, "<this>", StockListViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            StockListViewModel stockListViewModel = (StockListViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(stockListViewModel);
            this.f17284b = stockListViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f28752g = fragmentComponent.f();
            FirebaseAnalytics d11 = bVar.d();
            yk.g.i(d11);
            this.f28753h = d11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
