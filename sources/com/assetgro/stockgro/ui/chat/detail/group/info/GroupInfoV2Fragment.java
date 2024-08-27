package com.assetgro.stockgro.ui.chat.detail.group.info;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.g;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import androidx.recyclerview.widget.RecyclerView;
import ba.dg;
import ba.uh;
import ba.vh;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.model.CharLimit;
import com.assetgro.stockgro.data.model.ExitOption;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupInfoActions;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.GroupUIConfig;
import com.assetgro.stockgro.data.model.MembersCount;
import com.assetgro.stockgro.data.model.OpenForAudienceDto;
import com.assetgro.stockgro.data.model.RiaRraInfo;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.GroupInvitedListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberListActivity;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.chat.detail.messages.pin.GroupPinnedMessagesActivity;
import com.assetgro.stockgro.ui.chat.members.BannedMembersListActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.b;
import ea.n0;
import gd.m;
import id.a;
import iu.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.o;
import m.w;
import okhttp3.HttpUrl;
import q6.l;
import qu.i0;
import td.b0;
import td.c0;
import td.e0;
import td.r;
import td.s;
import td.t;
import td.t0;
import vd.d;
import vt.p0;
import yd.c;
import yd.e;
import zq.f;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/info/GroupInfoV2Fragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/detail/group/info/GroupInfoViewModel;", "Lba/uh;", "Lyd/c;", "<init>", "()V", "td/i", HttpUrl.FRAGMENT_ENCODE_SET, "isSheetOpened", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupInfoV2Fragment extends m<GroupInfoViewModel, uh> implements c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f9216r = 0;

    /* renamed from: g, reason: collision with root package name */
    public final e.c f9217g;

    /* renamed from: h, reason: collision with root package name */
    public final i f9218h;

    /* renamed from: i, reason: collision with root package name */
    public d f9219i;

    /* renamed from: j, reason: collision with root package name */
    public d f9220j;

    /* renamed from: k, reason: collision with root package name */
    public d f9221k;

    /* renamed from: l, reason: collision with root package name */
    public td.i f9222l;

    /* renamed from: m, reason: collision with root package name */
    public final e.c f9223m;

    /* renamed from: n, reason: collision with root package name */
    public final e.c f9224n;

    /* renamed from: o, reason: collision with root package name */
    public final e.c f9225o;

    /* renamed from: p, reason: collision with root package name */
    public final e.c f9226p;

    /* renamed from: q, reason: collision with root package name */
    public final e.c f9227q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [f.a, java.lang.Object] */
    public GroupInfoV2Fragment() {
        final int i10 = 0;
        e.c registerForActivityResult = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i11 = i10;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i11) {
                    case 0:
                        int i12 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i15 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9217g = registerForActivityResult;
        this.f9218h = new i(a0.a(b0.class), new z1(this, 20));
        final int i11 = 1;
        e.c registerForActivityResult2 = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i11;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i12 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i15 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f9223m = registerForActivityResult2;
        final int i12 = 2;
        e.c registerForActivityResult3 = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i12;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i15 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.f9224n = registerForActivityResult3;
        final int i13 = 3;
        e.c registerForActivityResult4 = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i13;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i15 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult4, "registerForActivityResult(...)");
        this.f9225o = registerForActivityResult4;
        final int i14 = 4;
        e.c registerForActivityResult5 = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i14;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i15 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult5, "registerForActivityResult(...)");
        this.f9226p = registerForActivityResult5;
        final int i15 = 5;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i15;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i152 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i16 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
        final int i16 = 6;
        e.c registerForActivityResult6 = registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i16;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i152 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i162 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult6, "registerForActivityResult(...)");
        this.f9227q = registerForActivityResult6;
        final int i17 = 7;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new Object(), new b(this) { // from class: td.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35875b;

            {
                this.f35875b = this;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i17;
                Object obj2 = null;
                GroupInfoV2Fragment this$0 = this.f35875b;
                switch (i112) {
                    case 0:
                        int i122 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) this$0.r();
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new t0(groupInfoViewModel, null), 3);
                            groupInfoViewModel.m();
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((uh) this$0.q()).K);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext, uri));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((uh) this$0.q()).H);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext2, uri2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    case 3:
                        int i152 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            ?? obj3 = new Object();
                            Context requireContext3 = this$0.requireContext();
                            String string = this$0.getString(R.string.profile_reported_body);
                            String string2 = this$0.getString(R.string.report_sent_text);
                            String string3 = this$0.getString(R.string.ok);
                            eb.f fVar = new eb.f(this$0, 0);
                            Intrinsics.c(requireContext3);
                            Intrinsics.c(string);
                            Intrinsics.c(string3);
                            Intrinsics.c(string2);
                            qj.b.b(obj3, requireContext3, string, string3, null, string2, null, false, 0, 0, fVar, 65496);
                            this$0.I("report_group_reported");
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar = (e.a) obj;
                        int i162 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((uh) this$0.q()).K);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 5:
                        e.a aVar2 = (e.a) obj;
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((com.bumptech.glide.g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((uh) this$0.q()).K);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext4, data));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Display);
                            return;
                        }
                        return;
                    case 6:
                        e.a aVar3 = (e.a) obj;
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((uh) this$0.q()).H);
                            ((GroupInfoViewModel) this$0.r()).C = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((uh) this$0.q()).H);
                            Context requireContext5 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                            ((GroupInfoViewModel) this$0.r()).C = new File(vl.b.z(requireContext5, data2));
                            ((GroupInfoViewModel) this$0.r()).n(GroupImageType.Cover);
                            return;
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
    }

    public static final void H(GroupInfoV2Fragment groupInfoV2Fragment, GroupMember member, View view, e0 listType) {
        GroupInfoActions adminActions;
        String globalRole;
        w wVar = new w(groupInfoV2Fragment.requireContext(), view);
        new j((Context) wVar.f25760a).inflate(R.menu.menu_member_options, (o) wVar.f25761b);
        GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) groupInfoV2Fragment.r();
        Intrinsics.checkNotNullParameter(listType, "listType");
        Intrinsics.checkNotNullParameter(member, "member");
        ArrayList arrayList = new ArrayList();
        GroupUIConfig groupUIConfig = (GroupUIConfig) groupInfoViewModel.f9248r.getValue();
        if (groupUIConfig != null) {
            int ordinal = listType.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        adminActions = groupUIConfig.getSeederActions();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    adminActions = groupUIConfig.getModeratorActions();
                }
            } else {
                adminActions = groupUIConfig.getAdminActions();
            }
            if (adminActions != null) {
                if (adminActions.getMessageUser()) {
                    arrayList.add(new Pair(100, Integer.valueOf(R.string.text_menu_option_chat)));
                }
                if (adminActions.getDismiss()) {
                    arrayList.add(new Pair(101, Integer.valueOf(R.string.text_menu_option_dismiss)));
                }
                if (adminActions.getRemove()) {
                    arrayList.add(new Pair(102, Integer.valueOf(R.string.text_menu_option_remove)));
                }
                if (adminActions.getReport()) {
                    arrayList.add(new Pair(104, Integer.valueOf(R.string.text_menu_option_report)));
                }
                if (adminActions.getBan() || adminActions.getUnban()) {
                    if (Intrinsics.a(member.getRole(), "Rogue")) {
                        arrayList.add(new Pair(111, Integer.valueOf(R.string.text_unban)));
                    } else {
                        arrayList.add(new Pair(105, Integer.valueOf(R.string.text_ban)));
                    }
                }
                if (adminActions.getMakeSeeder()) {
                    arrayList.add(new Pair(106, Integer.valueOf(R.string.text_menu_option_make_seeder)));
                }
                if (adminActions.getMakeAdmin()) {
                    arrayList.add(new Pair(107, Integer.valueOf(R.string.text_menu_option_make_admin)));
                }
                if (adminActions.getMakeModerator()) {
                    arrayList.add(new Pair(108, Integer.valueOf(R.string.text_menu_option_make_moderator)));
                }
                if ((adminActions.getDeactivate() || adminActions.getActivate()) && (globalRole = member.getGlobalRole()) != null) {
                    if (Intrinsics.a(globalRole, "Rogue")) {
                        arrayList.add(new Pair(110, Integer.valueOf(R.string.text_menu_option_activate)));
                    } else {
                        arrayList.add(new Pair(109, Integer.valueOf(R.string.text_menu_option_deactivate)));
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((o) wVar.f25761b).add(((Number) pair.f23353a).intValue(), ((Number) pair.f23353a).intValue(), 0, ((Number) pair.f23354b).intValue());
        }
        wVar.f25764e = new g(18, groupInfoV2Fragment, member);
        wVar.k();
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_group_info_v2;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupInfoViewModel) r()).f9084g.observe(this, new a(8, new s(this, 10)));
        ((GroupInfoViewModel) r()).f9246q.observe(this, new a(8, new s(this, 12)));
        GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) r();
        groupInfoViewModel.K.observe(this, new a(8, new s(this, 13)));
        GroupInfoViewModel groupInfoViewModel2 = (GroupInfoViewModel) r();
        groupInfoViewModel2.G.observe(this, new a(8, new s(this, 14)));
        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) r();
        groupInfoViewModel3.H.observe(this, new a(8, new s(this, 15)));
        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) r();
        groupInfoViewModel4.I.observe(this, new a(8, new s(this, 16)));
        GroupInfoViewModel groupInfoViewModel5 = (GroupInfoViewModel) r();
        groupInfoViewModel5.J.observe(this, new a(8, new s(this, 17)));
        GroupInfoViewModel groupInfoViewModel6 = (GroupInfoViewModel) r();
        groupInfoViewModel6.U.observe(this, new a(8, new s(this, 18)));
        GroupInfoViewModel groupInfoViewModel7 = (GroupInfoViewModel) r();
        groupInfoViewModel7.L.observe(this, new a(8, new s(this, 19)));
        GroupInfoViewModel groupInfoViewModel8 = (GroupInfoViewModel) r();
        groupInfoViewModel8.M.observe(this, new a(8, new s(this, 0)));
        GroupInfoViewModel groupInfoViewModel9 = (GroupInfoViewModel) r();
        groupInfoViewModel9.N.observe(this, new a(8, new s(this, 1)));
        ((GroupInfoViewModel) r()).f9250s.observe(this, new a(8, new s(this, 2)));
        ((GroupInfoViewModel) r()).f9258w.observe(this, new a(8, new s(this, 3)));
        GroupInfoViewModel groupInfoViewModel10 = (GroupInfoViewModel) r();
        groupInfoViewModel10.n0.observe(this, new a(8, new s(this, 4)));
        GroupInfoViewModel groupInfoViewModel11 = (GroupInfoViewModel) r();
        groupInfoViewModel11.f9243o0.observe(this, new a(8, new s(this, 5)));
        GroupInfoViewModel groupInfoViewModel12 = (GroupInfoViewModel) r();
        groupInfoViewModel12.f9255u0.observe(this, new a(8, new s(this, 6)));
        ((GroupInfoViewModel) r()).f9260x.observe(this, new a(8, new s(this, 7)));
        ((GroupInfoViewModel) r()).f9262y.observe(this, new a(8, new s(this, 8)));
        GroupInfoViewModel groupInfoViewModel13 = (GroupInfoViewModel) r();
        groupInfoViewModel13.V.observe(this, new a(8, new s(this, 9)));
        ((GroupInfoViewModel) r()).B.observe(this, new a(8, new s(this, 11)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        vh vhVar = (vh) ((uh) q());
        vhVar.f6314l0 = (GroupInfoViewModel) r();
        synchronized (vhVar) {
            vhVar.f6440q0 |= 67108864;
        }
        int i10 = 25;
        vhVar.a(25);
        vhVar.m();
        ((uh) q()).p(this);
        GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) r();
        String str = ((b0) this.f9218h.getValue()).f35826a;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        groupInfoViewModel.F = str;
        GroupInfoViewModel groupInfoViewModel2 = (GroupInfoViewModel) r();
        final int i11 = 3;
        yk.g.H(u0.f(groupInfoViewModel2), null, null, new t0(groupInfoViewModel2, null), 3);
        groupInfoViewModel2.m();
        final int i12 = 1;
        setHasOptionsMenu(true);
        final int i13 = 0;
        ((uh) q()).f6313k0.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i14;
                Integer groupNameMax;
                int i15 = i13;
                int i16 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i15) {
                    case 0:
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i16);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i14 = groupNameMax.intValue();
                        } else {
                            i14 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i14, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i14 = 8;
        ((uh) q()).f6312j0.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i15 = i14;
                int i16 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i15) {
                    case 0:
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i16);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i15 = 9;
        ((uh) q()).f6309g0.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i15;
                int i16 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i16);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i16 = 10;
        ((uh) q()).f6320x.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i16;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i17 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i17 = 11;
        ((uh) q()).f6315s.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i17;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i18 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        ((uh) q()).V.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: td.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35869b;

            {
                this.f35869b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                int i18 = i12;
                GroupInfoV2Fragment this$0 = this.f35869b;
                switch (i18) {
                    case 0:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (compoundButton.isPressed()) {
                            GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                            OpenForAudienceDto openForAudienceDto = new OpenForAudienceDto(((b0) this$0.f9218h.getValue()).f35826a, Boolean.valueOf(!z10));
                            Intrinsics.checkNotNullParameter(openForAudienceDto, "openForAudienceDto");
                            groupInfoViewModel3.f9084g.postValue(Boolean.TRUE);
                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel3), null, null, new o0(groupInfoViewModel3, openForAudienceDto, null), 3);
                            return;
                        }
                        return;
                    default:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (compoundButton.isPressed()) {
                            this$0.I("mute_toggle");
                            GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                            Group group = (Group) groupInfoViewModel4.f9246q.getValue();
                            if (group != null) {
                                groupInfoViewModel4.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel4), null, null, new j0(groupInfoViewModel4, group, z10, null), 3);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i18 = 12;
        ((uh) q()).C.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i18;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i182 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i19 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i19 = 13;
        ((uh) q()).E.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i19;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i182 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i192 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i20 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i20 = 14;
        ((uh) q()).F.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i20;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i182 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i192 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i202 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i21 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        final int i21 = 15;
        ((uh) q()).I.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i21;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i182 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i192 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i202 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i212 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        ((uh) q()).D.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupInfoV2Fragment f35863b;

            {
                this.f35863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj;
                String riaRraUserId;
                MembersCount membersCount;
                String groupId;
                String groupId2;
                String groupId3;
                List<Tags> arrayList;
                int i142;
                Integer groupNameMax;
                int i152 = i12;
                int i162 = 1;
                Integer num = null;
                GroupInfoV2Fragment this$0 = this.f35863b;
                switch (i152) {
                    case 0:
                        int i172 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("viewmembers_tapped");
                        this$0.M(false);
                        return;
                    case 1:
                        int i182 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.J();
                        return;
                    case 2:
                        int i192 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("exit_initiated");
                        this$0.P();
                        return;
                    case 3:
                        int i202 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("report_group_initiated");
                        View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        r rVar = new r(composeView, this$0, viewGroup, i162);
                        Object obj2 = b1.d.f3079a;
                        composeView.setContent(new b1.c(rVar, true, -833612651));
                        viewGroup.addView(composeView);
                        return;
                    case 4:
                        int i212 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                        if (str2 != null) {
                            androidx.fragment.app.j0 activity = this$0.getActivity();
                            if (activity != null) {
                                obj = activity.getSystemService("clipboard");
                            } else {
                                obj = null;
                            }
                            Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                            Context context2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                            String text = this$0.getString(R.string.text_link_copied);
                            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context2.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        int i22 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("ExpertDMicon_tapped");
                        Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                            ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                            return;
                        }
                        return;
                    case 6:
                        int i23 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("expertname_tapped");
                        this$0.K();
                        return;
                    case 7:
                        int i24 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.K();
                        return;
                    case 8:
                        int i25 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                        int i26 = GroupInvitedListActivity.f9272l;
                        androidx.fragment.app.j0 context3 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                        Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                            num = Integer.valueOf(membersCount.getInvitedUsers());
                        }
                        String noOfInvites = String.valueOf(num);
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(groupId4, "groupId");
                        Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                        Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                        intent.putExtra("CHAT_GROUP_ID", groupId4);
                        intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                        this$0.f9217g.a(intent);
                        return;
                    case 9:
                        int i27 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("view_starred_msg");
                        Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group3 != null && (groupId = group3.getGroupId()) != null) {
                            Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                            intent2.putExtra("GROUP_CHAT_ID", groupId);
                            intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                            this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    case 10:
                        int i28 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                            int i29 = BannedMembersListActivity.f9417l;
                            androidx.fragment.app.j0 context4 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context4, "context");
                            Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                            intent3.putExtra("CHAT_GROUP_ID", groupId2);
                            this$0.startActivity(intent3);
                            return;
                        }
                        return;
                    case 11:
                        int i30 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                            int i31 = AddMembersHostComposeActivity.f9299k;
                            androidx.fragment.app.j0 context5 = this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                            Intrinsics.checkNotNullParameter(context5, "context");
                            Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                            intent4.putExtra("CHAT_GROUP_ID", groupId3);
                            this$0.f9217g.a(intent4);
                            return;
                        }
                        return;
                    case 12:
                        int i32 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType = GroupImageType.Cover;
                        Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                        groupInfoViewModel3.f9244p = groupImageType;
                        this$0.R();
                        return;
                    case 13:
                        int i33 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                        GroupImageType groupImageType2 = GroupImageType.Display;
                        Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                        groupInfoViewModel4.f9244p = groupImageType2;
                        this$0.R();
                        return;
                    case 14:
                        int i34 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                        if (group6 == null || (arrayList = group6.getTags()) == null) {
                            arrayList = new ArrayList<>();
                        }
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Tags) it.next()).getTagId());
                        }
                        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                        if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                            i142 = groupNameMax.intValue();
                        } else {
                            i142 = 50;
                        }
                        String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                        if (groupName != null) {
                            String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                            Intrinsics.checkNotNullParameter(groupId5, "groupId");
                            Intrinsics.checkNotNullParameter(groupName, "groupName");
                            q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                            return;
                        }
                        return;
                    default:
                        int i35 = GroupInfoV2Fragment.f9216r;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I("description_viewmore_tapped");
                        return;
                }
            }
        });
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        d dVar = new d(lifecycle, ((GroupInfoViewModel) r()).f9241n.getUserId(), new s(this, 20), new s(this, 21), new t(this, 0), true, true);
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f9219i = dVar;
        RecyclerView recyclerView = ((uh) q()).f6317u;
        d dVar2 = this.f9219i;
        if (dVar2 != null) {
            recyclerView.setAdapter(dVar2);
            androidx.lifecycle.o lifecycle2 = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
            d dVar3 = new d(lifecycle2, ((GroupInfoViewModel) r()).f9241n.getUserId(), new s(this, 22), new s(this, 23), new t(this, 1), true, true);
            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
            this.f9220j = dVar3;
            RecyclerView recyclerView2 = ((uh) q()).U;
            d dVar4 = this.f9220j;
            if (dVar4 != null) {
                recyclerView2.setAdapter(dVar4);
                androidx.lifecycle.o lifecycle3 = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle3, "<get-lifecycle>(...)");
                String userId = ((GroupInfoViewModel) r()).f9241n.getUserId();
                s sVar = new s(this, 24);
                s sVar2 = new s(this, i10);
                final int i22 = 2;
                d dVar5 = new d(lifecycle3, userId, sVar, sVar2, new t(this, 2), true, true);
                Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                this.f9221k = dVar5;
                RecyclerView recyclerView3 = ((uh) q()).f6322z;
                d dVar6 = this.f9221k;
                if (dVar6 != null) {
                    recyclerView3.setAdapter(dVar6);
                    ((uh) q()).G.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i22;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i23 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i24 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i25 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i26 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    ((uh) q()).Y.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i11;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i23 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i24 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i25 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i26 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    final int i23 = 4;
                    ((uh) q()).W.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i23;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i232 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i24 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i25 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i26 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    ((uh) q()).f6318v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: td.f

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35869b;

                        {
                            this.f35869b = this;
                        }

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                            int i182 = i13;
                            GroupInfoV2Fragment this$0 = this.f35869b;
                            switch (i182) {
                                case 0:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    if (compoundButton.isPressed()) {
                                        GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                        OpenForAudienceDto openForAudienceDto = new OpenForAudienceDto(((b0) this$0.f9218h.getValue()).f35826a, Boolean.valueOf(!z10));
                                        Intrinsics.checkNotNullParameter(openForAudienceDto, "openForAudienceDto");
                                        groupInfoViewModel3.f9084g.postValue(Boolean.TRUE);
                                        yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel3), null, null, new o0(groupInfoViewModel3, openForAudienceDto, null), 3);
                                        return;
                                    }
                                    return;
                                default:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    if (compoundButton.isPressed()) {
                                        this$0.I("mute_toggle");
                                        GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                        Group group = (Group) groupInfoViewModel4.f9246q.getValue();
                                        if (group != null) {
                                            groupInfoViewModel4.f9084g.postValue(Boolean.TRUE);
                                            yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel4), null, null, new j0(groupInfoViewModel4, group, z10, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    final int i24 = 5;
                    ((uh) q()).A.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i24;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i232 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i242 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i25 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i26 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    final int i25 = 6;
                    ((uh) q()).f6303a0.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i25;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i232 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i242 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i252 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i26 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    final int i26 = 7;
                    ((uh) q()).f6304b0.setOnClickListener(new View.OnClickListener(this) { // from class: td.e

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ GroupInfoV2Fragment f35863b;

                        {
                            this.f35863b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            Object obj;
                            String riaRraUserId;
                            MembersCount membersCount;
                            String groupId;
                            String groupId2;
                            String groupId3;
                            List<Tags> arrayList;
                            int i142;
                            Integer groupNameMax;
                            int i152 = i26;
                            int i162 = 1;
                            Integer num = null;
                            GroupInfoV2Fragment this$0 = this.f35863b;
                            switch (i152) {
                                case 0:
                                    int i172 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("viewmembers_tapped");
                                    this$0.M(false);
                                    return;
                                case 1:
                                    int i182 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.J();
                                    return;
                                case 2:
                                    int i192 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("exit_initiated");
                                    this$0.P();
                                    return;
                                case 3:
                                    int i202 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("report_group_initiated");
                                    View findViewById = this$0.requireActivity().findViewById(android.R.id.content);
                                    Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                                    ViewGroup viewGroup = (ViewGroup) findViewById;
                                    Context context = viewGroup.getContext();
                                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                    ComposeView composeView = new ComposeView(context, null, 6);
                                    r rVar = new r(composeView, this$0, viewGroup, i162);
                                    Object obj2 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(rVar, true, -833612651));
                                    viewGroup.addView(composeView);
                                    return;
                                case 4:
                                    int i212 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String str2 = (String) ((GroupInfoViewModel) this$0.r()).K.getValue();
                                    if (str2 != null) {
                                        androidx.fragment.app.j0 activity = this$0.getActivity();
                                        if (activity != null) {
                                            obj = activity.getSystemService("clipboard");
                                        } else {
                                            obj = null;
                                        }
                                        Intrinsics.d(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("text", str2));
                                        Context context2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                        String text = this$0.getString(R.string.text_link_copied);
                                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                                        Intrinsics.checkNotNullParameter(context2, "context");
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        if (text.length() != 0) {
                                            Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                            Object systemService = context2.getSystemService("layout_inflater");
                                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    int i222 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("ExpertDMicon_tapped");
                                    Group group = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group != null && (riaRraUserId = group.getRiaRraUserId()) != null) {
                                        ((GroupInfoViewModel) this$0.r()).k(riaRraUserId);
                                        return;
                                    }
                                    return;
                                case 6:
                                    int i232 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("expertname_tapped");
                                    this$0.K();
                                    return;
                                case 7:
                                    int i242 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.K();
                                    return;
                                case 8:
                                    int i252 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    String groupId4 = ((GroupInfoViewModel) this$0.r()).F;
                                    int i262 = GroupInvitedListActivity.f9272l;
                                    androidx.fragment.app.j0 context3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(context3, "requireActivity(...)");
                                    Group group2 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group2 != null && (membersCount = group2.getMembersCount()) != null) {
                                        num = Integer.valueOf(membersCount.getInvitedUsers());
                                    }
                                    String noOfInvites = String.valueOf(num);
                                    Intrinsics.checkNotNullParameter(context3, "context");
                                    Intrinsics.checkNotNullParameter(groupId4, "groupId");
                                    Intrinsics.checkNotNullParameter(noOfInvites, "noOfInvites");
                                    Intent intent = new Intent(context3, (Class<?>) GroupInvitedListActivity.class);
                                    intent.putExtra("CHAT_GROUP_ID", groupId4);
                                    intent.putExtra("CHAT_GROUP_NO_OF_INVITEES", noOfInvites);
                                    this$0.f9217g.a(intent);
                                    return;
                                case 9:
                                    int i27 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("view_starred_msg");
                                    Group group3 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group3 != null && (groupId = group3.getGroupId()) != null) {
                                        Intent intent2 = new Intent(this$0.requireActivity(), (Class<?>) GroupPinnedMessagesActivity.class);
                                        intent2.putExtra("GROUP_CHAT_ID", groupId);
                                        intent2.putExtra("MESSAGES_TYPE", "USER_STARRED_MESSAGES");
                                        this$0.startActivity(intent2);
                                        return;
                                    }
                                    return;
                                case 10:
                                    int i28 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group4 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group4 != null && (groupId2 = group4.getGroupId()) != null) {
                                        int i29 = BannedMembersListActivity.f9417l;
                                        androidx.fragment.app.j0 context4 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context4, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context4, "context");
                                        Intent intent3 = new Intent(context4, (Class<?>) BannedMembersListActivity.class);
                                        intent3.putExtra("CHAT_GROUP_ID", groupId2);
                                        this$0.startActivity(intent3);
                                        return;
                                    }
                                    return;
                                case 11:
                                    int i30 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group5 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group5 != null && (groupId3 = group5.getGroupId()) != null) {
                                        int i31 = AddMembersHostComposeActivity.f9299k;
                                        androidx.fragment.app.j0 context5 = this$0.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(context5, "requireActivity(...)");
                                        Intrinsics.checkNotNullParameter(context5, "context");
                                        Intent intent4 = new Intent(context5, (Class<?>) AddMembersHostComposeActivity.class);
                                        intent4.putExtra("CHAT_GROUP_ID", groupId3);
                                        this$0.f9217g.a(intent4);
                                        return;
                                    }
                                    return;
                                case 12:
                                    int i32 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel3 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType = GroupImageType.Cover;
                                    Intrinsics.checkNotNullParameter(groupImageType, "<set-?>");
                                    groupInfoViewModel3.f9244p = groupImageType;
                                    this$0.R();
                                    return;
                                case 13:
                                    int i33 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    GroupInfoViewModel groupInfoViewModel4 = (GroupInfoViewModel) this$0.r();
                                    GroupImageType groupImageType2 = GroupImageType.Display;
                                    Intrinsics.checkNotNullParameter(groupImageType2, "<set-?>");
                                    groupInfoViewModel4.f9244p = groupImageType2;
                                    this$0.R();
                                    return;
                                case 14:
                                    int i34 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    Group group6 = (Group) ((GroupInfoViewModel) this$0.r()).f9246q.getValue();
                                    if (group6 == null || (arrayList = group6.getTags()) == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                                    Iterator<T> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Tags) it.next()).getTagId());
                                    }
                                    CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) this$0.r()).f9263z.getValue();
                                    if (charLimit != null && (groupNameMax = charLimit.getGroupNameMax()) != null) {
                                        i142 = groupNameMax.intValue();
                                    } else {
                                        i142 = 50;
                                    }
                                    String groupName = (String) ((GroupInfoViewModel) this$0.r()).G.getValue();
                                    if (groupName != null) {
                                        String groupId5 = ((GroupInfoViewModel) this$0.r()).F;
                                        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                                        Intrinsics.checkNotNullParameter(groupId5, "groupId");
                                        Intrinsics.checkNotNullParameter(groupName, "groupName");
                                        q6.l.h(this$0).o(new d0(groupId5, i142, strArr, groupName));
                                        return;
                                    }
                                    return;
                                default:
                                    int i35 = GroupInfoV2Fragment.f9216r;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.I("description_viewmore_tapped");
                                    return;
                            }
                        }
                    });
                    getChildFragmentManager().a0(this, new vc.b(this, i25));
                    if (getActivity() instanceof GroupInfoActivity) {
                        j0 activity = getActivity();
                        Intrinsics.d(activity, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoActivity");
                        if (((GroupInfoViewModel) ((GroupInfoActivity) activity).x()).D != null) {
                            LinearLayout adminSettingsLayout = ((uh) q()).f6319w;
                            Intrinsics.checkNotNullExpressionValue(adminSettingsLayout, "adminSettingsLayout");
                            f.M(adminSettingsLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Intrinsics.k("chatSeederListAdapter");
                throw null;
            }
            Intrinsics.k("moderatorListAdapter");
            throw null;
        }
        Intrinsics.k("adminListAdapter");
        throw null;
    }

    public final void I(String interactionType) {
        Group group = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group != null) {
            String groupId = group.getGroupId();
            String groupName = group.getGroupName();
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(interactionType, "interactionType");
            y(new AnalyticEvent("app_groupinfo_interaction", p0.f(new Pair("group_id", groupId), new Pair("group_name", groupName), new Pair("interaction_type", interactionType))));
        }
    }

    public final void J() {
        int i10;
        Integer groupDescMax;
        CharLimit charLimit = (CharLimit) ((GroupInfoViewModel) r()).f9263z.getValue();
        if (charLimit != null && (groupDescMax = charLimit.getGroupDescMax()) != null) {
            i10 = groupDescMax.intValue();
        } else {
            i10 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        }
        String groupId = ((GroupInfoViewModel) r()).F;
        String str = (String) ((GroupInfoViewModel) r()).H.getValue();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        l.h(this).o(new c0(groupId, str, i10));
    }

    public final void K() {
        RiaRraInfo riaRraInfo;
        Class cls;
        String str;
        Group group = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        String str2 = null;
        if (group != null) {
            riaRraInfo = group.getRiaRraInfo();
        } else {
            riaRraInfo = null;
        }
        if (riaRraInfo != null && riaRraInfo.getIsExpert()) {
            cls = RiaProfileActivity.class;
        } else {
            cls = UserProfileActivity.class;
        }
        Intent intent = new Intent(requireContext(), (Class<?>) cls);
        Group group2 = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group2 != null) {
            str = group2.getRiaRraUserId();
        } else {
            str = null;
        }
        intent.putExtra("USER_IDENTIFIER", str);
        intent.putExtra("CALL_FROM_CHAT", true);
        if (riaRraInfo != null) {
            str2 = riaRraInfo.getDisplayName();
        }
        intent.putExtra("USER_NAME", str2);
        startActivity(intent);
    }

    public final void L() {
        if (kj.f.m(this)) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (getActivity() != null) {
                Intent intent2 = new Intent(intent);
                if (((GroupInfoViewModel) r()).f9244p == GroupImageType.Cover) {
                    this.f9227q.a(intent2);
                    return;
                } else {
                    this.f9226p.a(intent2);
                    return;
                }
            }
            return;
        }
        kj.f.b(this, 1001, new lc.b(this, 10));
    }

    public final void M(boolean z10) {
        String str;
        String groupId = ((GroupInfoViewModel) r()).F;
        int i10 = GroupMemberListActivity.f9283m;
        j0 context = requireActivity();
        Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
        Group group = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group != null) {
            str = group.getType();
        } else {
            str = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intent intent = new Intent(context, (Class<?>) GroupMemberListActivity.class);
        intent.putExtra("CHAT_GROUP_ID", groupId);
        intent.putExtra("CHAT_GROUP_TYPE", str);
        intent.putExtra("SHOW_SELECT_ADMIN_VIEW", z10);
        this.f9217g.a(intent);
    }

    public final void N(GroupMember groupMember) {
        ((GroupInfoViewModel) r()).k(groupMember.getUserId());
    }

    public final void O(GroupMember groupMember) {
        Class cls;
        if (groupMember.getIsExpert()) {
            cls = RiaProfileActivity.class;
        } else {
            cls = UserProfileActivity.class;
        }
        Intent intent = new Intent(requireContext(), (Class<?>) cls);
        intent.putExtra("USER_IDENTIFIER", groupMember.getUserId());
        intent.putExtra("CALL_FROM_CHAT", true);
        intent.putExtra("USER_NAME", groupMember.getMemberName());
        startActivity(intent);
    }

    public final void P() {
        Integer num;
        List list;
        String str;
        Pair pair;
        List<ExitOption> exitReasons;
        GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) r();
        Group group = (Group) groupInfoViewModel.f9246q.getValue();
        Unit unit = null;
        if (group != null) {
            num = Integer.valueOf(group.getMemberCount());
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != 1) && (list = (List) groupInfoViewModel.L.getValue()) != null && list.size() == 1 && Intrinsics.a(((GroupMember) list.get(0)).getUserId(), groupInfoViewModel.f9081d.getCurrentUserId())) {
            this.f9222l = td.i.f35888b;
            Group group2 = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
            if (group2 == null || (str = group2.getGroupName()) == null) {
                str = "group";
            }
            String string = getString(R.string.text_assign_new_admin_before_exit);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String m10 = a3.a.m(new Object[]{str}, 1, string, "format(...)");
            int length = str.length() + 29;
            SpannableString spannableString = new SpannableString(m10);
            spannableString.setSpan(new StyleSpan(1), 29, length, 33);
            String string2 = getString(R.string.exit_group);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(R.string.ok);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(R.string.cancel);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            ci.c socialBottomSheetData = new ci.c(R.drawable.ic_group_info_exit, string2, spannableString, string3, string4);
            Intrinsics.checkNotNullParameter(socialBottomSheetData, "socialBottomSheetData");
            Bundle bundle = new Bundle();
            ci.b bVar = new ci.b();
            bundle.putSerializable("DATA", socialBottomSheetData);
            bVar.setArguments(bundle);
            bVar.show(getChildFragmentManager(), "SocialActionConfirmationBottomSheet");
            return;
        }
        Group group3 = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group3 != null) {
            if (kotlin.text.s.j(group3.getType(), "1on1", false)) {
                pair = new Pair(Integer.valueOf(R.string.text_message_exit_personal_group), group3.getFriendUserName());
            } else {
                pair = new Pair(Integer.valueOf(R.string.text_message_exit_multi_group), group3.getGroupName());
            }
        } else {
            pair = new Pair(Integer.valueOf(R.string.group_exit_message), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String string5 = getString(((Number) pair.f23353a).intValue());
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String m11 = a3.a.m(new Object[]{pair.f23354b}, 1, string5, "format(...)");
        Group group4 = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group4 != null && (exitReasons = group4.getExitReasons()) != null) {
            if (exitReasons.isEmpty()) {
                Q(m11);
            } else {
                c cVar = e.f41535b;
                String string6 = getString(R.string.exit_group);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                String string7 = getString(R.string.cancel);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                sb.b.b(m11, string6, string7, this, exitReasons).show(getChildFragmentManager(), "ExitDialogFragment");
            }
            unit = Unit.f23355a;
        }
        if (unit == null) {
            Q(m11);
        }
    }

    public final void Q(String alertMessage) {
        int i10;
        Group group = (Group) ((GroupInfoViewModel) r()).f9246q.getValue();
        if (group != null) {
            if (kotlin.text.s.j(group.getType(), "1on1", false)) {
                i10 = R.string.text_delete_chat;
            } else {
                i10 = R.string.exit_group;
            }
        } else {
            i10 = R.string.exit;
        }
        eb.f listener = new eb.f(this, 0);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        String positiveButtonText = getString(i10);
        Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
        String negativeButtonText = getString(R.string.cancel);
        Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(listener, "listener");
        h.i iVar = new h.i(context, R.style.StockgroDialogTheme);
        h.e eVar = iVar.f17693a;
        eVar.f17611f = alertMessage;
        qj.c cVar = new qj.c(listener, 0);
        eVar.f17612g = positiveButtonText;
        eVar.f17613h = cVar;
        qj.c cVar2 = new qj.c(listener, 1);
        eVar.f17614i = negativeButtonText;
        eVar.f17615j = cVar2;
        iVar.c();
    }

    public final void R() {
        j0 activity = getActivity();
        if (activity != null) {
            final ao.f fVar = new ao.f(activity, R.style.AppBottomSheetDialogTheme);
            LayoutInflater from = LayoutInflater.from(requireContext());
            int i10 = dg.f4486u;
            final int i11 = 0;
            dg dgVar = (dg) m4.m.g(from, R.layout.fragment_bottom_sheet_photo_select, null, false, null);
            Intrinsics.checkNotNullExpressionValue(dgVar, "inflate(...)");
            fVar.setContentView(dgVar.f27491e);
            fVar.show();
            dgVar.f4487s.setOnClickListener(new View.OnClickListener(this) { // from class: td.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GroupInfoV2Fragment f35881b;

                {
                    this.f35881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i11;
                    ao.f mBottomSheetDialog = fVar;
                    GroupInfoV2Fragment this$0 = this.f35881b;
                    switch (i12) {
                        case 0:
                            int i13 = GroupInfoV2Fragment.f9216r;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            this$0.L();
                            mBottomSheetDialog.dismiss();
                            return;
                        default:
                            int i14 = GroupInfoV2Fragment.f9216r;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            GroupImageType groupImageType = ((GroupInfoViewModel) this$0.r()).f9244p;
                            GroupImageType groupImageType2 = GroupImageType.Cover;
                            f.d dVar = f.d.f15871a;
                            if (groupImageType == groupImageType2) {
                                this$0.f9224n.a(qu.i0.e(dVar));
                            } else {
                                this$0.f9223m.a(qu.i0.e(dVar));
                            }
                            mBottomSheetDialog.dismiss();
                            return;
                    }
                }
            });
            final int i12 = 1;
            dgVar.f4488t.setOnClickListener(new View.OnClickListener(this) { // from class: td.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GroupInfoV2Fragment f35881b;

                {
                    this.f35881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i12;
                    ao.f mBottomSheetDialog = fVar;
                    GroupInfoV2Fragment this$0 = this.f35881b;
                    switch (i122) {
                        case 0:
                            int i13 = GroupInfoV2Fragment.f9216r;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            this$0.L();
                            mBottomSheetDialog.dismiss();
                            return;
                        default:
                            int i14 = GroupInfoV2Fragment.f9216r;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            GroupImageType groupImageType = ((GroupInfoViewModel) this$0.r()).f9244p;
                            GroupImageType groupImageType2 = GroupImageType.Cover;
                            f.d dVar = f.d.f15871a;
                            if (groupImageType == groupImageType2) {
                                this$0.f9224n.a(qu.i0.e(dVar));
                            } else {
                                this$0.f9223m.a(qu.i0.e(dVar));
                            }
                            mBottomSheetDialog.dismiss();
                            return;
                    }
                }
            });
        }
    }

    @Override // yd.c
    public final void d(ExitOption reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        ((GroupInfoViewModel) r()).l(new ExitData(reason.getCode(), reason.getMsg()));
    }

    @Override // yd.c
    public final void e() {
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(R.menu.menu_group_info_user, menu);
    }

    @Override // androidx.fragment.app.g0
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        switch (item.getItemId()) {
            case R.id.menu_options_edit_group_description /* 2131363377 */:
                J();
                break;
            case R.id.menu_options_exit_group /* 2131363378 */:
                P();
                break;
            case R.id.menu_options_report_group /* 2131363387 */:
                View findViewById = requireActivity().findViewById(android.R.id.content);
                Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) findViewById;
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ComposeView composeView = new ComposeView(context, null, 6);
                r rVar = new r(composeView, this, viewGroup, 0);
                Object obj = b1.d.f3079a;
                composeView.setContent(new b1.c(rVar, true, 400153226));
                viewGroup.addView(composeView);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (r4 != null) goto L25;
     */
    @Override // androidx.fragment.app.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPrepareOptionsMenu(android.view.Menu r6) {
        /*
            r5 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r6.clear()
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r5.r()
            com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel r0 = (com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel) r0
            androidx.lifecycle.e0 r0 = r0.f9258w
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            r1 = 2131689479(0x7f0f0007, float:1.9007975E38)
            if (r0 == 0) goto L5f
            com.assetgro.stockgro.data.enums.UserRoles r2 = com.assetgro.stockgro.data.enums.UserRoles.Admin
            java.lang.String r3 = r2.getParamName()
            java.lang.Object r4 = r0.f23353a
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r4, r3)
            r4 = 0
            if (r3 != 0) goto L49
            java.lang.String r2 = r2.getParamName()
            java.lang.Object r0 = r0.f23354b
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r2)
            if (r0 == 0) goto L37
            goto L49
        L37:
            androidx.fragment.app.j0 r0 = r5.getActivity()
            if (r0 == 0) goto L5d
            android.view.MenuInflater r0 = r0.getMenuInflater()
            if (r0 == 0) goto L5d
            r0.inflate(r1, r6)
            kotlin.Unit r4 = kotlin.Unit.f23355a
            goto L5d
        L49:
            androidx.fragment.app.j0 r0 = r5.getActivity()
            if (r0 == 0) goto L5d
            android.view.MenuInflater r0 = r0.getMenuInflater()
            if (r0 == 0) goto L5d
            r2 = 2131689478(0x7f0f0006, float:1.9007973E38)
            r0.inflate(r2, r6)
            kotlin.Unit r4 = kotlin.Unit.f23355a
        L5d:
            if (r4 != 0) goto L70
        L5f:
            androidx.fragment.app.j0 r0 = r5.getActivity()
            if (r0 == 0) goto L70
            android.view.MenuInflater r0 = r0.getMenuInflater()
            if (r0 == 0) goto L70
            r0.inflate(r1, r6)
            kotlin.Unit r0 = kotlin.Unit.f23355a
        L70:
            super.onPrepareOptionsMenu(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment.onPrepareOptionsMenu(android.view.Menu):void");
    }

    @Override // androidx.fragment.app.g0
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        String str;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 1001) {
            if (kj.f.m(this)) {
                L();
                return;
            }
            Context requireContext = requireContext();
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.text_camera_permission_rationale);
            } else {
                str = null;
            }
            dp.b.M1(requireContext, str);
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        yk.g.i(chatRepository);
        ArenaRepository arenaRepository = bVar.a();
        yk.g.i(arenaRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(GroupInfoViewModel.class), new ea.j(k10, c10, chatRepository, userRepository, arenaRepository, 1));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupInfoViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupInfoViewModel.class, "<this>", GroupInfoViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(groupInfoViewModel);
            this.f17284b = groupInfoViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
