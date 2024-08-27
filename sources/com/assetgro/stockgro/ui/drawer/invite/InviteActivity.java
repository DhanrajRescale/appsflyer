package com.assetgro.stockgro.ui.drawer.invite;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ba.a1;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.invite.InviteActivity;
import com.assetgro.stockgro.ui.drawer.invite.InviteViewModel;
import com.assetgro.stockgro.ui.drawer.invite.InvitedFriendsActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import gd.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import re.d;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/invite/InviteActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/invite/InviteViewModel;", "Lba/a1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InviteActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9486l = 0;

    /* renamed from: k, reason: collision with root package name */
    public Intent f9487k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_invite;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((InviteViewModel) x()).f9490p.observe(this, new d(3, new ye.b(this, 0)));
        ((InviteViewModel) x()).f9488n.observe(this, new d(3, new ye.b(this, 1)));
        ((InviteViewModel) x()).f9491q.observe(this, new d(3, new ye.b(this, 2)));
    }

    @Override // gd.b
    public final void I() {
        a1 a1Var = (a1) w();
        a1Var.f4151v.setTitle(getString(R.string.invite_friends));
        this.f17260h = "invite-friends";
        Toolbar toolbarInvite = ((a1) w()).f4151v;
        Intrinsics.checkNotNullExpressionValue(toolbarInvite, "toolbarInvite");
        v(toolbarInvite);
        u(((a1) w()).f4151v);
        a1 a1Var2 = (a1) w();
        final int i10 = 0;
        a1Var2.f4151v.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: ye.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteActivity f41598b;

            {
                this.f41598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                InviteActivity this$0 = this.f41598b;
                switch (i11) {
                    case 0:
                        int i12 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = this$0.f9487k;
                        if (intent != null) {
                            this$0.startActivity(Intent.createChooser(intent, "Invite a friend via..."));
                            return;
                        }
                        return;
                    case 2:
                        int i14 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ArrayList arrayList = (ArrayList) ((InviteViewModel) this$0.x()).f9491q.getValue();
                        if (arrayList != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) InvitedFriendsActivity.class);
                            intent2.putExtra("DATA", arrayList);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    default:
                        int i15 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = (String) ((InviteViewModel) this$0.x()).f9490p.getValue();
                        if (str != null) {
                            Object systemService = this$0.getSystemService("clipboard");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
                        }
                        hl.f.S0(R.string.text_invite_code_copied, this$0);
                        return;
                }
            }
        });
        a1 a1Var3 = (a1) w();
        final int i11 = 1;
        a1Var3.f4149t.setOnClickListener(new View.OnClickListener(this) { // from class: ye.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteActivity f41598b;

            {
                this.f41598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                InviteActivity this$0 = this.f41598b;
                switch (i112) {
                    case 0:
                        int i12 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = this$0.f9487k;
                        if (intent != null) {
                            this$0.startActivity(Intent.createChooser(intent, "Invite a friend via..."));
                            return;
                        }
                        return;
                    case 2:
                        int i14 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ArrayList arrayList = (ArrayList) ((InviteViewModel) this$0.x()).f9491q.getValue();
                        if (arrayList != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) InvitedFriendsActivity.class);
                            intent2.putExtra("DATA", arrayList);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    default:
                        int i15 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = (String) ((InviteViewModel) this$0.x()).f9490p.getValue();
                        if (str != null) {
                            Object systemService = this$0.getSystemService("clipboard");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
                        }
                        hl.f.S0(R.string.text_invite_code_copied, this$0);
                        return;
                }
            }
        });
        a1 a1Var4 = (a1) w();
        final int i12 = 2;
        a1Var4.f4152w.setOnClickListener(new View.OnClickListener(this) { // from class: ye.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteActivity f41598b;

            {
                this.f41598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                InviteActivity this$0 = this.f41598b;
                switch (i112) {
                    case 0:
                        int i122 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i13 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = this$0.f9487k;
                        if (intent != null) {
                            this$0.startActivity(Intent.createChooser(intent, "Invite a friend via..."));
                            return;
                        }
                        return;
                    case 2:
                        int i14 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ArrayList arrayList = (ArrayList) ((InviteViewModel) this$0.x()).f9491q.getValue();
                        if (arrayList != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) InvitedFriendsActivity.class);
                            intent2.putExtra("DATA", arrayList);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    default:
                        int i15 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = (String) ((InviteViewModel) this$0.x()).f9490p.getValue();
                        if (str != null) {
                            Object systemService = this$0.getSystemService("clipboard");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
                        }
                        hl.f.S0(R.string.text_invite_code_copied, this$0);
                        return;
                }
            }
        });
        a1 a1Var5 = (a1) w();
        final int i13 = 3;
        a1Var5.f4148s.setOnClickListener(new View.OnClickListener(this) { // from class: ye.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InviteActivity f41598b;

            {
                this.f41598b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                InviteActivity this$0 = this.f41598b;
                switch (i112) {
                    case 0:
                        int i122 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 1:
                        int i132 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intent intent = this$0.f9487k;
                        if (intent != null) {
                            this$0.startActivity(Intent.createChooser(intent, "Invite a friend via..."));
                            return;
                        }
                        return;
                    case 2:
                        int i14 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ArrayList arrayList = (ArrayList) ((InviteViewModel) this$0.x()).f9491q.getValue();
                        if (arrayList != null) {
                            Intent intent2 = new Intent(this$0, (Class<?>) InvitedFriendsActivity.class);
                            intent2.putExtra("DATA", arrayList);
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    default:
                        int i15 = InviteActivity.f9486l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = (String) ((InviteViewModel) this$0.x()).f9490p.getValue();
                        if (str != null) {
                            Object systemService = this$0.getSystemService("clipboard");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
                        }
                        hl.f.S0(R.string.text_invite_code_copied, this$0);
                        return;
                }
            }
        });
    }

    @Override // gd.b, androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.h();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
