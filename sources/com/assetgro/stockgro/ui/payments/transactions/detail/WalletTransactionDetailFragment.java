package com.assetgro.stockgro.ui.payments.transactions.detail;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.aq;
import ba.bq;
import cg.b;
import cg.c;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.remote.response.TransactionDetailResponse;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailFragment;
import com.assetgro.stockgro.ui.payments.transactions.detail.WalletTransactionDetailViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import java.io.ByteArrayOutputStream;
import kj.a;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import okhttp3.HttpUrl;
import q6.l;
import qu.i0;
import r3.k;
import xf.x;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/transactions/detail/WalletTransactionDetailFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/transactions/detail/WalletTransactionDetailViewModel;", "Lba/aq;", "<init>", "()V", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WalletTransactionDetailFragment extends m<WalletTransactionDetailViewModel, aq> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9720h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9721g = new i(a0.a(b.class), new x(this, 1));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_wallet_transaction_detail;
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        bq bqVar = (bq) ((aq) q());
        bqVar.Q = (WalletTransactionDetailViewModel) r();
        synchronized (bqVar) {
            bqVar.S |= 4;
        }
        bqVar.a(24);
        bqVar.m();
        ((aq) q()).p(this);
        Toolbar toolbar = ((aq) q()).H;
        Intrinsics.c(toolbar);
        p(toolbar);
        j0 activity = getActivity();
        Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((h.m) activity).u(toolbar);
        final int i10 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: cg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletTransactionDetailFragment f8131b;

            {
                this.f8131b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String txnID;
                String txnID2;
                int i11 = i10;
                WalletTransactionDetailFragment this$0 = this.f8131b;
                switch (i11) {
                    case 0:
                        int i12 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse != null && (txnID = transactionDetailResponse.getTxnID()) != null) {
                            this$0.x(new AnalyticEvent("app_txn_id_copied", null, 2, null));
                            this$0.H(txnID);
                            return;
                        }
                        return;
                    default:
                        int i14 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse2 = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse2 != null && (txnID2 = transactionDetailResponse2.getTxnID()) != null) {
                            this$0.H(txnID2);
                            return;
                        }
                        return;
                }
            }
        });
        WalletTransactionDetailViewModel walletTransactionDetailViewModel = (WalletTransactionDetailViewModel) r();
        String transactionId = ((b) this.f9721g.getValue()).f8132a;
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        g.H(u0.f(walletTransactionDetailViewModel), null, null, new c(walletTransactionDetailViewModel, transactionId, null), 3);
        String str = ((b) this.f9721g.getValue()).f8133b;
        if (Intrinsics.a(str, "SUCCESS")) {
            ((aq) q()).H.setTitle(getString(R.string.wallet_transaction_success));
            ((aq) q()).O.setAnimation("transaction_history_payment_success.json");
        } else if (Intrinsics.a(str, "PENDING")) {
            ((aq) q()).H.setTitle(getString(R.string.wallet_transaction_pending));
            ((aq) q()).O.setAnimation("transaction_history_payment_pending.json");
        } else {
            ((aq) q()).H.setTitle(getString(R.string.wallet_transaction_failed));
            ((aq) q()).O.setAnimation("transaction_history_payment_failed.json");
        }
        final int i11 = 1;
        ((aq) q()).L.setOnClickListener(new View.OnClickListener(this) { // from class: cg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletTransactionDetailFragment f8131b;

            {
                this.f8131b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String txnID;
                String txnID2;
                int i112 = i11;
                WalletTransactionDetailFragment this$0 = this.f8131b;
                switch (i112) {
                    case 0:
                        int i12 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse != null && (txnID = transactionDetailResponse.getTxnID()) != null) {
                            this$0.x(new AnalyticEvent("app_txn_id_copied", null, 2, null));
                            this$0.H(txnID);
                            return;
                        }
                        return;
                    default:
                        int i14 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse2 = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse2 != null && (txnID2 = transactionDetailResponse2.getTxnID()) != null) {
                            this$0.H(txnID2);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((aq) q()).f4219t.setOnClickListener(new View.OnClickListener(this) { // from class: cg.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WalletTransactionDetailFragment f8131b;

            {
                this.f8131b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String txnID;
                String txnID2;
                int i112 = i12;
                WalletTransactionDetailFragment this$0 = this.f8131b;
                switch (i112) {
                    case 0:
                        int i122 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                    case 1:
                        int i13 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse != null && (txnID = transactionDetailResponse.getTxnID()) != null) {
                            this$0.x(new AnalyticEvent("app_txn_id_copied", null, 2, null));
                            this$0.H(txnID);
                            return;
                        }
                        return;
                    default:
                        int i14 = WalletTransactionDetailFragment.f9720h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        TransactionDetailResponse transactionDetailResponse2 = (TransactionDetailResponse) ((WalletTransactionDetailViewModel) this$0.r()).f9724p.getValue();
                        if (transactionDetailResponse2 != null && (txnID2 = transactionDetailResponse2.getTxnID()) != null) {
                            this$0.H(txnID2);
                            return;
                        }
                        return;
                }
            }
        });
        if (a.f23207b) {
            ((aq) q()).A.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_aed));
        } else {
            ((aq) q()).A.setImageDrawable(k.getDrawable(requireContext(), R.drawable.ic_cash_14dp_new));
        }
    }

    public final void H(String str) {
        Object systemService = requireContext().getSystemService("clipboard");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Data", str));
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("Copied!", "text");
        if ("Copied!".length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService2 = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            w.k.c("Copied!", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(R.menu.menu_toolbar_with_share, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // gd.m, androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.g0
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.action_share) {
            y(new AnalyticEvent("app_txn_detail_share", null, 2, null));
            ConstraintLayout transactionContainer = ((aq) q()).J;
            Intrinsics.checkNotNullExpressionValue(transactionContainer, "transactionContainer");
            int i10 = f.f23221a;
            Intrinsics.checkNotNullParameter(transactionContainer, "<this>");
            Bitmap createBitmap = Bitmap.createBitmap(transactionContainer.getWidth(), transactionContainer.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            transactionContainer.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(transactionContainer.getResources(), createBitmap);
            Context context = requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            Intrinsics.checkNotNullParameter(bitmapDrawable, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("StockGro", "sharetitle");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "extraSubject");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "extraText");
            Bitmap bitmap = bitmapDrawable.getBitmap();
            try {
                if (bitmap == null) {
                    Toast.makeText(context, "Try again later", 0).show();
                    return true;
                }
                Intrinsics.checkNotNullParameter(bitmap, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, new ByteArrayOutputStream());
                Uri parse = Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", (String) null));
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", parse);
                if (!w.C(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    intent.putExtra("android.intent.extra.SUBJECT", HttpUrl.FRAGMENT_ENCODE_SET);
                }
                if (!w.C(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    intent.putExtra("android.intent.extra.TEXT", HttpUrl.FRAGMENT_ENCODE_SET);
                }
                context.startActivity(Intent.createChooser(intent, "StockGro"));
                return true;
            } catch (Exception e10) {
                FirebaseCrashlytics.getInstance().log(String.valueOf(e10.getMessage()));
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        PaymentRepository paymentRepository = bVar.i();
        g.i(paymentRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(WalletTransactionDetailViewModel.class), new ea.k(k10, c10, paymentRepository, userRepository, 11));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, WalletTransactionDetailViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(WalletTransactionDetailViewModel.class, "<this>", WalletTransactionDetailViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            WalletTransactionDetailViewModel walletTransactionDetailViewModel = (WalletTransactionDetailViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(walletTransactionDetailViewModel);
            this.f17284b = walletTransactionDetailViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
