package com.assetgro.stockgro.ui.chat.detail.group;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.i0;
import ba.e8;
import ba.ev;
import ba.f8;
import ba.jr;
import ba.wh;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.DiscoverDto;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.my.LeagueSharedViewModel;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.assetgro.stockgro.ui.chat.preview.MediaAssetUploadPreviewActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e.c;
import ea.n0;
import gd.m;
import ij.o;
import iu.a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import k7.k0;
import k7.y;
import ke.a;
import kj.f;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.v2;
import mt.p;
import nn.d;
import okhttp3.HttpUrl;
import qu.r0;
import rd.b0;
import rd.e;
import rd.i;
import rd.n;
import rd.q;
import rd.w;
import rd.z;
import ue.b;
import ue.h;
import vt.p0;
import yd.r;
import yd.t;
import yk.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatViewModel;", "Lba/wh;", "Lke/a;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupChatFragment extends m<GroupChatViewModel, wh> implements a {

    /* renamed from: w, reason: collision with root package name */
    public static PopupWindow f9146w;

    /* renamed from: g, reason: collision with root package name */
    public LeagueSharedViewModel f9147g;

    /* renamed from: h, reason: collision with root package name */
    public final c f9148h;

    /* renamed from: i, reason: collision with root package name */
    public final c f9149i;

    /* renamed from: j, reason: collision with root package name */
    public final c f9150j;

    /* renamed from: k, reason: collision with root package name */
    public final c f9151k;

    /* renamed from: l, reason: collision with root package name */
    public final c f9152l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9153m;

    /* renamed from: n, reason: collision with root package name */
    public b f9154n;

    /* renamed from: o, reason: collision with root package name */
    public p f9155o;

    /* renamed from: p, reason: collision with root package name */
    public ef.b f9156p;

    /* renamed from: q, reason: collision with root package name */
    public r f9157q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayoutManager f9158r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9159s;

    /* renamed from: t, reason: collision with root package name */
    public t f9160t;

    /* renamed from: u, reason: collision with root package name */
    public ChatSharedViewModel f9161u;

    /* renamed from: v, reason: collision with root package name */
    public final c f9162v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [f.a, java.lang.Object] */
    public GroupChatFragment() {
        final int i10 = 0;
        c registerForActivityResult = registerForActivityResult(new Object(), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i11 = i10;
                GroupChatFragment this$0 = this.f33625b;
                int i12 = 2;
                int i13 = 1;
                Object obj2 = null;
                switch (i11) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i12);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i13);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f9148h = registerForActivityResult;
        final int i11 = 1;
        c registerForActivityResult2 = registerForActivityResult(new Object(), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i112 = i11;
                GroupChatFragment this$0 = this.f33625b;
                int i12 = 2;
                int i13 = 1;
                Object obj2 = null;
                switch (i112) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i12);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i13);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f9149i = registerForActivityResult2;
        final int i12 = 2;
        c registerForActivityResult3 = registerForActivityResult(new Object(), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i112 = i12;
                GroupChatFragment this$0 = this.f33625b;
                int i122 = 2;
                int i13 = 1;
                Object obj2 = null;
                switch (i112) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i122);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i13);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.f9150j = registerForActivityResult3;
        final int i13 = 3;
        c registerForActivityResult4 = registerForActivityResult(new Object(), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i112 = i13;
                GroupChatFragment this$0 = this.f33625b;
                int i122 = 2;
                int i132 = 1;
                Object obj2 = null;
                switch (i112) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i122);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i132);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult4, "registerForActivityResult(...)");
        this.f9151k = registerForActivityResult4;
        final int i14 = 4;
        c registerForActivityResult5 = registerForActivityResult(new Object(), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i112 = i14;
                GroupChatFragment this$0 = this.f33625b;
                int i122 = 2;
                int i132 = 1;
                Object obj2 = null;
                switch (i112) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i122);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i132);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult5, "registerForActivityResult(...)");
        this.f9152l = registerForActivityResult5;
        final int i15 = 5;
        c registerForActivityResult6 = registerForActivityResult(new f.b(i10), new e.b(this) { // from class: rd.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatFragment f33625b;

            {
                this.f33625b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [qj.b, java.lang.Object] */
            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Bundle extras;
                Intent intent2;
                Uri uri;
                String string;
                Cursor cursor;
                ContentResolver contentResolver;
                int i112 = i15;
                GroupChatFragment this$0 = this.f33625b;
                int i122 = 2;
                int i132 = 1;
                Object obj2 = null;
                switch (i112) {
                    case 0:
                        PopupWindow popupWindow = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) this$0.r();
                        yk.g.H(u0.f(groupChatViewModel), r0.f32256b, null, new b0(groupChatViewModel, null), 2);
                        return;
                    case 1:
                        e.a aVar = (e.a) obj;
                        PopupWindow popupWindow2 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) this$0.r();
                        synchronized (groupChatViewModel2) {
                            groupChatViewModel2.M0 = false;
                        }
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null && (extras = intent.getExtras()) != null) {
                            Object obj3 = extras.get("CHAT_MESSAGE");
                            if (obj3 instanceof ChatMessage) {
                                obj2 = (ChatMessage) obj3;
                            }
                            Object obj4 = extras.get("CHAT_MESSAGE_ACTION");
                            Intrinsics.d(obj4, "null cannot be cast to non-null type com.assetgro.stockgro.ui.chat.detail.messages.MessageActions");
                            yd.f fVar = (yd.f) obj4;
                            if (obj2 != null) {
                                ArrayList arrayList = ((GroupChatViewModel) this$0.r()).f9199z;
                                arrayList.clear();
                                arrayList.add(obj2);
                            }
                            int ordinal = fVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        this$0.L().B.postValue(new kj.j(Unit.f23355a));
                                        return;
                                    }
                                    return;
                                }
                                this$0.L().A.postValue(new kj.j(Unit.f23355a));
                                return;
                            }
                            this$0.L().f9145z.postValue(new kj.j(Unit.f23355a));
                            return;
                        }
                        return;
                    case 2:
                        PopupWindow popupWindow3 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (((e.a) obj).f14610a == -1) {
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.message_reported), 0).show();
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        PopupWindow popupWindow4 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1) {
                            Intent intent3 = aVar2.f14611b;
                            if (intent3 != null) {
                                Bundle extras2 = intent3.getExtras();
                                if (extras2 != null) {
                                    obj2 = Boolean.valueOf(extras2.getBoolean("BLOCKED", false));
                                }
                                if (Intrinsics.a(obj2, Boolean.TRUE)) {
                                    ComposeView blockedText = ((wh) this$0.q()).f6533t.f5170t;
                                    Intrinsics.checkNotNullExpressionValue(blockedText, "blockedText");
                                    zq.f.m0(blockedText);
                                    ComposeView composeView = ((wh) this$0.q()).f6533t.f5170t;
                                    k kVar = new k(this$0, i122);
                                    Object obj5 = b1.d.f3079a;
                                    composeView.setContent(new b1.c(kVar, true, -1094414129));
                                }
                            }
                            ?? obj6 = new Object();
                            Context requireContext = this$0.requireContext();
                            String string2 = this$0.getString(R.string.profile_reported_body);
                            String string3 = this$0.getString(R.string.report_sent_text);
                            String string4 = this$0.getString(R.string.ok);
                            l lVar = new l(this$0, i132);
                            Intrinsics.c(requireContext);
                            Intrinsics.c(string2);
                            Intrinsics.c(string4);
                            Intrinsics.c(string3);
                            qj.b.b(obj6, requireContext, string2, string4, null, string3, null, false, 0, 0, lVar, 65496);
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        PopupWindow popupWindow5 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent2 = aVar3.f14611b) != null) {
                            Bundle extras3 = intent2.getExtras();
                            if (extras3 != null && (string = extras3.getString("URI")) != null) {
                                uri = Uri.parse(string);
                            } else {
                                uri = null;
                            }
                            Bundle extras4 = intent2.getExtras();
                            if (extras4 != null) {
                                obj2 = extras4.getString("CHAT_MESSAGE");
                            }
                            String str = obj2;
                            if (uri != null) {
                                if (((GroupChatViewModel) this$0.r()).f9198y0) {
                                    ChatMessage chatMessage = ((GroupChatViewModel) this$0.r()).f9193w;
                                    if (chatMessage != null) {
                                        GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) this$0.r();
                                        Context requireContext2 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                        Context requireContext3 = this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                        groupChatViewModel3.A(requireContext2, uri, str, chatMessage, new File(vl.b.z(requireContext3, uri)).getName());
                                    }
                                    PopupWindow popupWindow6 = GroupChatFragment.f9146w;
                                    if (popupWindow6 != null) {
                                        popupWindow6.dismiss();
                                        return;
                                    }
                                    return;
                                }
                                GroupChatViewModel groupChatViewModel4 = (GroupChatViewModel) this$0.r();
                                Context requireContext4 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                Context requireContext5 = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                groupChatViewModel4.A(requireContext4, uri, str, null, new File(vl.b.z(requireContext5, uri)).getName());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        Uri uri2 = (Uri) obj;
                        PopupWindow popupWindow7 = GroupChatFragment.f9146w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            j0 activity = this$0.getActivity();
                            if (activity != null && (contentResolver = activity.getContentResolver()) != null) {
                                cursor = contentResolver.query(uri2, null, null, null, null);
                            } else {
                                cursor = null;
                            }
                            if (cursor != null) {
                                try {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    cursor.moveToFirst();
                                    if (Integer.parseInt(cursor.getString(columnIndex).toString()) < 15728640) {
                                        this$0.Q(uri2);
                                    } else {
                                        Context requireContext6 = this$0.requireContext();
                                        String string5 = this$0.getString(R.string.max_file_size_toast);
                                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                        String format = String.format(string5, Arrays.copyOf(new Object[]{15}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        Toast.makeText(requireContext6, format, 0).show();
                                    }
                                    Unit unit = Unit.f23355a;
                                    yk.g.k(cursor, null);
                                    return;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        yk.g.k(cursor, th2);
                                        throw th3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult6, "registerForActivityResult(...)");
        this.f9162v = registerForActivityResult6;
    }

    public static final void H(GroupChatFragment groupChatFragment, String senderId, String interactionType) {
        Group group = (Group) ((GroupChatViewModel) groupChatFragment.r()).D.getValue();
        if (group != null) {
            String groupId = group.getGroupId();
            String groupName = group.getGroupName();
            String groupType = HttpUrl.FRAGMENT_ENCODE_SET;
            if (senderId == null) {
                senderId = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String type = group.getType();
            if (type != null) {
                groupType = type;
            }
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(interactionType, "interactionType");
            Intrinsics.checkNotNullParameter(senderId, "senderId");
            Intrinsics.checkNotNullParameter(groupType, "groupType");
            groupChatFragment.x(new AnalyticEvent("app_msg_interaction", p0.f(new Pair("interaction_type", interactionType), new Pair("group_id", groupId), new Pair("group_name", groupName), new Pair("sender_id", senderId), new Pair("group_type", groupType))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r5.f9165c0.contains(r5.f9192v0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment r3, java.lang.String r4, java.lang.String r5) {
        /*
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r0 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r0
            com.assetgro.stockgro.data.repository.ChatRepository r0 = r0.f9176n
            java.lang.String r0 = r0.getUserId()
            if (r0 == 0) goto L21
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r4)
            if (r0 != 0) goto L8b
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r0 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r0
            boolean r0 = r0.x()
            if (r0 != 0) goto L21
            goto L8b
        L21:
            com.assetgro.stockgro.ui.base.BaseViewModel r0 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r0 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r0
            androidx.lifecycle.e0 r0 = r0.R
            sj.d r1 = new sj.d
            java.lang.String r2 = ""
            r1.<init>(r5, r2, r4)
            r0.postValue(r1)
            com.assetgro.stockgro.ui.base.BaseViewModel r5 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r5 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r5
            boolean r5 = r5.w()
            if (r5 != 0) goto L4f
            com.assetgro.stockgro.ui.base.BaseViewModel r5 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r5 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r5
            java.util.List r0 = r5.f9165c0
            java.lang.String r5 = r5.f9192v0
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L7e
        L4f:
            com.assetgro.stockgro.ui.base.BaseViewModel r5 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r5 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r5
            boolean r5 = r5.x()
            if (r5 == 0) goto L7e
            if (r4 == 0) goto L8b
            com.assetgro.stockgro.ui.base.BaseViewModel r3 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r3 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r3
            java.lang.String r5 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            androidx.lifecycle.e0 r5 = r3.f9084g
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.postValue(r0)
            z4.a r5 = androidx.lifecycle.u0.f(r3)
            rd.a0 r0 = new rd.a0
            r1 = 0
            r0.<init>(r3, r4, r1)
            r3 = 3
            yk.g.H(r5, r1, r1, r0, r3)
            goto L8b
        L7e:
            com.assetgro.stockgro.ui.base.BaseViewModel r3 = r3.r()
            com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel r3 = (com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel) r3
            androidx.lifecycle.e0 r3 = r3.f9171i0
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.postValue(r4)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment.I(com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment, java.lang.String, java.lang.String):void");
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_group_messages;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        int i10 = 13;
        int i11 = 4;
        int i12 = 6;
        ((GroupChatViewModel) d.f(4, new i(this, 25), ((GroupChatViewModel) d.f(4, new i(this, i10), L().f9138s, this)).f9173k0, this)).D.observe(this, new id.a(4, new n(this, i12)));
        int i13 = 11;
        ((GroupChatViewModel) r()).F.observe(this, new id.a(4, new n(this, i13)));
        int i14 = 12;
        ((GroupChatViewModel) r()).G.observe(this, new id.a(4, new n(this, i14)));
        ((GroupChatViewModel) r()).f9170h0.observe(this, new id.a(4, new n(this, i10)));
        int i15 = 14;
        ((GroupChatViewModel) r()).H.observe(this, new id.a(4, new n(this, i15)));
        int i16 = 15;
        ((GroupChatViewModel) r()).J.observe(this, new id.a(4, new n(this, i16)));
        int i17 = 16;
        ((GroupChatViewModel) r()).O.observe(this, new id.a(4, new n(this, i17)));
        int i18 = 3;
        int i19 = 5;
        e0 e0Var = ((GroupChatViewModel) d.f(4, new i(this, i12), ((GroupChatViewModel) d.f(4, new i(this, i19), ((GroupChatViewModel) d.f(4, new i(this, i11), ((GroupChatViewModel) d.f(4, new i(this, i18), ((GroupChatViewModel) r()).f9168f0, this)).M, this)).L, this)).f9169g0, this)).E;
        int i20 = 7;
        int i21 = 8;
        int i22 = 9;
        int i23 = 10;
        ((GroupChatViewModel) d.f(4, new i(this, 22), ((GroupChatViewModel) d.f(4, new i(this, 20), ((GroupChatViewModel) d.f(4, new i(this, 19), ((GroupChatViewModel) d.f(4, new i(this, 18), ((GroupChatViewModel) d.f(4, new i(this, 17), ((GroupChatViewModel) d.f(4, new i(this, i17), ((GroupChatViewModel) d.f(4, new i(this, i16), ((GroupChatViewModel) d.f(4, new i(this, i15), ((GroupChatViewModel) d.f(4, new i(this, i14), ((GroupChatViewModel) d.f(4, new i(this, i13), ((GroupChatViewModel) d.f(4, new i(this, i23), ((GroupChatViewModel) d.f(4, new i(this, i22), ((GroupChatViewModel) d.f(4, new i(this, i21), ((GroupChatViewModel) d.f(4, new i(this, i20), e0Var, this)).T, this)).S, this)).I, this)).K, this)).f9171i0, this)).f9172j0, this)).V, this)).Z, this)).U, this)).P, this)).W, this)).C, this)).B, this)).f9167e0.observe(this, new id.a(4, new i(this, 23)));
        L().f9139t.observe(this, new id.a(4, new i(this, 24)));
        L().f9140u.observe(this, new id.a(4, new i(this, 26)));
        L().f9141v.observe(this, new id.a(4, new i(this, 27)));
        L().f9142w.observe(this, new id.a(4, new i(this, 28)));
        L().f9143x.observe(this, new id.a(4, new i(this, 29)));
        L().f9144y.observe(this, new id.a(4, new n(this, 0)));
        L().f9145z.observe(this, new id.a(4, new n(this, 1)));
        L().A.observe(this, new id.a(4, new n(this, 2)));
        L().B.observe(this, new id.a(4, new n(this, i18)));
        L().G.observe(this, new id.a(4, new n(this, i11)));
        ((GroupChatViewModel) r()).X.observe(this, new id.a(4, new n(this, i19)));
        L().H.observe(this, new id.a(4, new n(this, i20)));
        ((GroupChatViewModel) r()).f9163a0.observe(this, new id.a(4, new n(this, i21)));
        ((GroupChatViewModel) r()).f9175m0.observe(this, new id.a(4, new n(this, i22)));
        L().F.observe(this, new id.a(4, new n(this, i23)));
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, mt.p] */
    @Override // gd.m
    public final void E(View view) {
        boolean z10;
        String str;
        boolean z11;
        ArenaGame arenaGame;
        String gameId;
        Intrinsics.checkNotNullParameter(view, "view");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f9154n = new b(requireContext);
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9155o = new Object();
        Bundle arguments = getArguments();
        int i10 = 0;
        if (arguments != null) {
            z10 = arguments.getBoolean("IS_PREPZONE_CHAT", false);
        } else {
            z10 = false;
        }
        this.f9153m = z10;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        this.f9157q = new r(requireContext2);
        if (this.f9153m) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arenaGame = (ArenaGame) arguments2.getParcelable("LEAGUE");
            } else {
                arenaGame = null;
            }
            if (!(arenaGame instanceof ArenaGame)) {
                arenaGame = null;
            }
            if (arenaGame != null && (gameId = arenaGame.getGameId()) != null) {
                ((GroupChatViewModel) r()).f9196x0 = gameId;
                ((GroupChatViewModel) r()).n(gameId);
            }
        } else {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                str = arguments3.getString("GROUP_CHAT_ID");
            } else {
                str = null;
            }
            if (str != null) {
                ((GroupChatViewModel) r()).f9196x0 = str;
                ((GroupChatViewModel) r()).n(str);
                ((GroupChatViewModel) r()).q(str);
            }
        }
        String groupId = ((GroupChatViewModel) r()).f9196x0;
        int i11 = 2;
        if (groupId != null) {
            b bVar = this.f9154n;
            if (bVar != null) {
                String userId = ((GroupChatViewModel) r()).f9176n.getUserId();
                if (userId == null) {
                    userId = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(userId, "userId");
                bVar.f37072b = groupId;
                bVar.f37073c = userId;
                b bVar2 = this.f9154n;
                if (bVar2 != null) {
                    bVar2.a(new i(this, i11));
                } else {
                    Intrinsics.k("chatCacheManager");
                    throw null;
                }
            } else {
                Intrinsics.k("chatCacheManager");
                throw null;
            }
        }
        String userId2 = ((GroupChatViewModel) r()).f9176n.getUserId();
        int i12 = 3;
        if (userId2 != null) {
            ((GroupChatViewModel) r()).r(userId2);
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) r();
            g.H(u0.f(groupChatViewModel), null, null, new w(groupChatViewModel, null), 3);
        }
        if (((GroupChatViewModel) r()).f9196x0 != null) {
            r rVar = this.f9157q;
            if (rVar != null) {
                rVar.f41592k = new h(rVar.f41585d);
                String currentUserId = rVar.f41587f;
                if (currentUserId != null) {
                    Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
                }
            } else {
                Intrinsics.k("messagesAdapter");
                throw null;
            }
        }
        requireContext();
        int i13 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.f9158r = linearLayoutManager;
        linearLayoutManager.c(null);
        if (true != linearLayoutManager.f2369t) {
            linearLayoutManager.f2369t = true;
            linearLayoutManager.q0();
        }
        RecyclerView recyclerView = ((wh) q()).f6533t.B;
        LinearLayoutManager linearLayoutManager2 = this.f9158r;
        if (linearLayoutManager2 != null) {
            recyclerView.setLayoutManager(linearLayoutManager2);
            r rVar2 = this.f9157q;
            if (rVar2 != null) {
                recyclerView.setAdapter(rVar2);
                recyclerView.setItemAnimator(null);
                recyclerView.j(new y(this, i11));
                Context requireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                ef.b bVar3 = new ef.b(requireContext3, new rd.m(this));
                this.f9156p = bVar3;
                new k0(bVar3).j(((wh) q()).f6533t.B);
                r rVar3 = this.f9157q;
                if (rVar3 != null) {
                    rd.m listener = new rd.m(this);
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    rVar3.f41591j = listener;
                    ((wh) q()).f6533t.f5175y.f4649v.getEditText().addTextChangedListener(new v2(this, i11));
                    ImageButton imageButton = ((wh) q()).f6533t.f5175y.f4647t;
                    if (M().length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    imageButton.setEnabled(!z11);
                    ((wh) q()).f6533t.f5175y.f4647t.setOnClickListener(new rd.d(this, i10));
                    ((wh) q()).f6533t.f5175y.f4648u.setOnClickListener(new rd.d(this, i13));
                    ((wh) q()).f6533t.f5175y.f4646s.setOnClickListener(new rd.d(this, i11));
                    ((wh) q()).f6533t.f5169s.setOnClickListener(new rd.d(this, i12));
                    ((wh) q()).f6533t.A.setOnClickListener(new rd.d(this, 4));
                    this.f9160t = new t(new i(this, i13));
                    jr jrVar = ((wh) q()).f6533t;
                    RecyclerView recyclerView2 = jrVar.D;
                    t tVar = this.f9160t;
                    if (tVar != null) {
                        recyclerView2.setAdapter(tVar);
                        jrVar.D.i(new o(f.j(20)));
                        ev evVar = jrVar.f5175y;
                        evVar.f4649v.setClickListener(new e(jrVar));
                        evVar.f4649v.setFocusListener(new e(jrVar));
                        ((wh) q()).f6533t.f5175y.f4649v.setListener(this);
                        ((wh) q()).f6533t.f5175y.f4649v.getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE)});
                        O();
                        return;
                    }
                    Intrinsics.k("stickerAdapter");
                    throw null;
                }
                Intrinsics.k("messagesAdapter");
                throw null;
            }
            Intrinsics.k("messagesAdapter");
            throw null;
        }
        Intrinsics.k("linearLayoutManager");
        throw null;
    }

    public final void J() {
        ((wh) q()).f6533t.f5175y.f4649v.getEditText().setText(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final void K() {
        PopupWindow popupWindow = f9146w;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        P(null, ((GroupChatViewModel) r()).f9179p);
        r rVar = this.f9157q;
        if (rVar != null) {
            rVar.r();
            O();
        } else {
            Intrinsics.k("messagesAdapter");
            throw null;
        }
    }

    public final ChatSharedViewModel L() {
        ChatSharedViewModel chatSharedViewModel = this.f9161u;
        if (chatSharedViewModel != null) {
            return chatSharedViewModel;
        }
        Intrinsics.k("chatSharedViewModel");
        throw null;
    }

    public final String M() {
        return kotlin.text.w.X(String.valueOf(((wh) q()).f6533t.f5175y.f4649v.getEditText().getText())).toString();
    }

    public final void N(ChatMessage replyMessage) {
        int measuredHeight;
        Sticker sticker;
        String sticker_id;
        PopupWindow popupWindow = f9146w;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        LayoutInflater from = LayoutInflater.from(requireContext());
        LinearLayout linearLayout = ((wh) q()).f6533t.f5174x;
        int i10 = e8.f4580z;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        int i11 = 0;
        e8 popupBinding = (e8) m4.m.g(from, R.layout.cell_chat_parent_message, linearLayout, false, null);
        Intrinsics.checkNotNullExpressionValue(popupBinding, "inflate(...)");
        if (this.f9155o != null) {
            i onDismissClicked = new i(this, i11);
            Intrinsics.checkNotNullParameter(popupBinding, "popupBinding");
            Intrinsics.checkNotNullParameter(replyMessage, "replyMessage");
            Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
            f8 f8Var = (f8) popupBinding;
            f8Var.f4587y = replyMessage;
            synchronized (f8Var) {
                f8Var.A |= 1;
            }
            f8Var.a(14);
            f8Var.m();
            popupBinding.f4581s.setOnClickListener(new jd.a(onDismissClicked, 2));
            PopupWindow popupWindow2 = f9146w;
            if (popupWindow2 != null) {
                popupWindow2.setFocusable(false);
            }
            popupBinding.f27491e.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Media media = replyMessage.getMedia();
            if (media != null && (sticker = media.getSticker()) != null && (sticker_id = sticker.getSticker_id()) != null && sticker_id.length() > 0) {
                measuredHeight = 210;
            } else {
                measuredHeight = popupBinding.f27491e.getMeasuredHeight();
            }
            PopupWindow popupWindow3 = new PopupWindow(popupBinding.f27491e, -1, measuredHeight);
            f9146w = popupWindow3;
            popupWindow3.showAsDropDown(((wh) q()).f6533t.f5175y.f4649v, 0, (-((wh) q()).f6533t.f5175y.f4649v.getMeasuredHeight()) - measuredHeight);
            return;
        }
        Intrinsics.k("chatReplyWindowManager");
        throw null;
    }

    public final void O() {
        L().E.postValue(new j(Unit.f23355a));
        r rVar = this.f9157q;
        if (rVar != null) {
            rVar.r();
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) r();
            groupChatViewModel.f9199z.clear();
            groupChatViewModel.f9194w0 = 0;
            return;
        }
        Intrinsics.k("messagesAdapter");
        throw null;
    }

    public final void P(ChatMessage chatMessage, int i10) {
        String str = null;
        int i11 = 0;
        if (i10 == ((GroupChatViewModel) r()).f9179p) {
            ((GroupChatViewModel) r()).f9189u = ((GroupChatViewModel) r()).f9179p;
            ((GroupChatViewModel) r()).f9191v = null;
            ImageButton buttonGroupChatUpload = ((wh) q()).f6533t.f5175y.f4648u;
            Intrinsics.checkNotNullExpressionValue(buttonGroupChatUpload, "buttonGroupChatUpload");
            ImageButton addSticker = ((wh) q()).f6533t.f5175y.f4646s;
            Intrinsics.checkNotNullExpressionValue(addSticker, "addSticker");
            f.r(true, buttonGroupChatUpload, addSticker);
            J();
            return;
        }
        if (i10 == ((GroupChatViewModel) r()).f9181q) {
            ((GroupChatViewModel) r()).f9189u = ((GroupChatViewModel) r()).f9181q;
            ((GroupChatViewModel) r()).f9191v = chatMessage;
            ImageButton buttonGroupChatUpload2 = ((wh) q()).f6533t.f5175y.f4648u;
            Intrinsics.checkNotNullExpressionValue(buttonGroupChatUpload2, "buttonGroupChatUpload");
            ImageButton addSticker2 = ((wh) q()).f6533t.f5175y.f4646s;
            Intrinsics.checkNotNullExpressionValue(addSticker2, "addSticker");
            f.r(false, buttonGroupChatUpload2, addSticker2);
            if (chatMessage != null) {
                str = chatMessage.getMessage();
            }
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            ((wh) q()).f6533t.f5175y.f4649v.getEditText().setText(str);
            if (str.length() > 0) {
                ((wh) q()).f6533t.f5175y.f4649v.getEditText().setSelection(0, str.length());
            }
            ((wh) q()).f6533t.f5175y.f4649v.requestFocus();
            ((wh) q()).f6533t.f5175y.f4649v.postDelayed(new rd.f(this, i11), 100L);
            return;
        }
        if (i10 == ((GroupChatViewModel) r()).f9183r) {
            if (((GroupChatViewModel) r()).f9178o0 || ((GroupChatViewModel) r()).w()) {
                ((GroupChatViewModel) r()).f9189u = ((GroupChatViewModel) r()).f9183r;
                ((GroupChatViewModel) r()).f9191v = chatMessage;
                ((wh) q()).f6533t.f5175y.f4649v.requestFocus();
                if (chatMessage != null) {
                    N(chatMessage);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == ((GroupChatViewModel) r()).f9185s) {
            ((GroupChatViewModel) r()).f9189u = ((GroupChatViewModel) r()).f9185s;
            ((GroupChatViewModel) r()).f9191v = chatMessage;
            ((wh) q()).f6533t.f5175y.f4649v.requestFocus();
            if (chatMessage != null) {
                N(chatMessage);
            }
        }
    }

    public final void Q(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent(requireContext(), (Class<?>) MediaAssetUploadPreviewActivity.class);
        intent.putExtra("URI", uri.toString());
        intent.putExtra("GROUP_NAME", ((GroupChatViewModel) r()).p());
        this.f9152l.a(intent);
    }

    @Override // ke.a
    public final void a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ((GroupChatViewModel) r()).z(text);
    }

    @Override // ke.a
    public final void i(sj.d user) {
        Intrinsics.checkNotNullParameter(user, "user");
        ((GroupChatViewModel) r()).Q.add(user);
        ((wh) q()).f6533t.f5175y.f4649v.setMentionedUser(user.f34661a);
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10011) {
            O();
            ((GroupChatViewModel) r()).l();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroy() {
        fv.e eVar = le.c.f24606a;
        if (eVar != null) {
            fv.e.c(eVar);
        }
        int i10 = 2;
        yq.b bVar = new yq.b(i10);
        fv.m mVar = le.g.f24613a;
        le.e eVar2 = new le.e(bVar, i10);
        mVar.f16332q = true;
        mVar.f16331p.a();
        mVar.f(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, null, eVar2);
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1, dp.b.x1(r4)) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    @Override // androidx.fragment.app.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment.onPause():void");
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        boolean z10;
        super.onResume();
        GroupChatViewModel groupChatViewModel = (GroupChatViewModel) r();
        synchronized (groupChatViewModel) {
            z10 = groupChatViewModel.M0;
        }
        if (z10) {
            GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) r();
            at.m<DiscoverDto> discoverHomeData = groupChatViewModel2.f9176n.getDiscoverHomeData();
            q qVar = new q(9, z.f33667b);
            discoverHomeData.getClass();
            nt.h c10 = new nt.f(discoverHomeData, qVar, 1).c(((kq.e) groupChatViewModel2.f9079b).J());
            jt.d dVar = new jt.d(new q(10, new rd.r(groupChatViewModel2, 15)), new q(11, new rd.r(groupChatViewModel2, 16)));
            c10.a(dVar);
            groupChatViewModel2.f9080c.c(dVar);
            GroupChatViewModel groupChatViewModel3 = (GroupChatViewModel) r();
            g.H(u0.f(groupChatViewModel3), r0.f32256b, null, new b0(groupChatViewModel3, null), 2);
        }
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        FollowerRepository followerRepository = bVar.f();
        g.i(followerRepository);
        ContactsRepository contactsRepository = fragmentComponent.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ArenaRepository arenaRepository = bVar.a();
        g.i(arenaRepository);
        i0 workManager = (i0) bVar.f14273y.get();
        g.i(workManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(GroupChatViewModel.class), new ea.h(k10, c10, chatRepository, followerRepository, contactsRepository, userRepository, arenaRepository, workManager, 1));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupChatViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupChatViewModel.class, "<this>", GroupChatViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            GroupChatViewModel groupChatViewModel = (GroupChatViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupChatViewModel);
            this.f17284b = groupChatViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            this.f9147g = fragmentComponent.e();
            this.f9161u = fragmentComponent.b();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
