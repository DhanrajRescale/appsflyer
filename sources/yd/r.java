package yd;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.j0;
import androidx.recyclerview.widget.RecyclerView;
import ba.ax;
import ba.dx;
import ba.fx;
import ba.gx;
import ba.rw;
import ba.tw;
import ba.xw;
import ba.yw;
import ba.zw;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.MessageInteraction;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.data.model.ThreadInfo;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import iu.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k7.y1;
import k7.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import m0.o0;
import okhttp3.HttpUrl;
import vt.y;
import x.p2;

/* loaded from: classes.dex */
public final class r extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f41585d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41586e;

    /* renamed from: f, reason: collision with root package name */
    public String f41587f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41588g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f41589h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f41590i;

    /* renamed from: j, reason: collision with root package name */
    public rd.m f41591j;

    /* renamed from: k, reason: collision with root package name */
    public ue.h f41592k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41593l;

    public r(Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f41585d = mContext;
        this.f41586e = new ArrayList();
        this.f41587f = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f41589h = new HashSet();
        this.f41590i = new ArrayList();
    }

    public static final void p(r rVar, String desc, String url, rd.m mVar) {
        rVar.getClass();
        if (desc == null) {
            desc = a3.a.d("toString(...)");
        }
        if (mVar != null) {
            Context context = rVar.f41585d;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(desc, "fileName");
            Intrinsics.checkNotNullParameter("File Desc", "desc");
            Intrinsics.checkNotNullParameter(url, "url");
            GroupChatFragment groupChatFragment = mVar.f33634a;
            Context context2 = groupChatFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
            String text = groupChatFragment.getString(R.string.text_downloading_file);
            Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            if (text.length() != 0) {
                Toast makeText = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                Object systemService = context2.getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                j0 activity = groupChatFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(desc, "fileName");
                Intrinsics.checkNotNullParameter(desc, "desc");
                Intrinsics.checkNotNullParameter(url, "url");
                DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(Uri.parse(url)).setAllowedNetworkTypes(3).setTitle(desc).setDescription(desc).setNotificationVisibility(1).setAllowedOverMetered(true).setAllowedOverRoaming(false).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, desc);
                Object systemService2 = activity.getSystemService("download");
                Intrinsics.d(systemService2, "null cannot be cast to non-null type android.app.DownloadManager");
                DownloadManager downloadManager = (DownloadManager) systemService2;
                ij.m mVar2 = new ij.m(downloadManager.enqueue(destinationInExternalPublicDir), downloadManager, activity);
                if (i10 >= 34) {
                    activity.registerReceiver(mVar2, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
                    return;
                } else {
                    activity.registerReceiver(mVar2, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                    return;
                }
            }
            j0 requireActivity = groupChatFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            el.l.L(requireActivity, context, desc, desc, url);
        }
    }

    public static void s(r rVar, View itemView, ChatMessage message, int i10, rd.m mVar, boolean z10, int i11) {
        boolean z11;
        boolean z12;
        String sticker_id;
        int i12 = 1;
        if ((i11 & 32) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(message, "message");
        int i13 = 0;
        if (message.getMedia() != null) {
            String type = message.getMedia().getType();
            if (type != null) {
                if (w.s(type, "image", false)) {
                    Sticker sticker = message.getMedia().getSticker();
                    if (sticker != null && (sticker_id = sticker.getSticker_id()) != null && sticker_id.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    View findViewById = itemView.findViewById(R.id.image_group_chat_file_thumbnail);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    ImageView imageView = (ImageView) findViewById;
                    z zVar = new z();
                    zVar.f20560a = "jpg";
                    ue.h hVar = rVar.f41592k;
                    if (hVar != null) {
                        hVar.c(message, itemView, new p(z12, mVar, message, i10, zVar, 0), new o(rVar, mVar, message, i10, 1));
                        rVar.w(message, mVar, i10, new p(z12, mVar, message, i10, zVar, 1), imageView);
                        ue.h hVar2 = rVar.f41592k;
                        if (hVar2 != null) {
                            ue.h.k(hVar2, message, itemView, true, false, false, 52);
                            return;
                        } else {
                            Intrinsics.k("chatMessageViewManager");
                            throw null;
                        }
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                if (w.s(type, "video", false)) {
                    View findViewById2 = itemView.findViewById(R.id.image_group_chat_file_thumbnail);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    ImageView imageView2 = (ImageView) findViewById2;
                    ue.h hVar3 = rVar.f41592k;
                    if (hVar3 != null) {
                        hVar3.e(message, itemView, new o(rVar, mVar, message, i10, 3), new o(rVar, mVar, message, i10, 4));
                        rVar.w(message, mVar, i10, new p2(i10, message, mVar), imageView2);
                        ue.h hVar4 = rVar.f41592k;
                        if (hVar4 != null) {
                            ue.h.k(hVar4, message, itemView, false, true, false, 44);
                            return;
                        } else {
                            Intrinsics.k("chatMessageViewManager");
                            throw null;
                        }
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                if (w.s(type, "document", false)) {
                    ue.h hVar5 = rVar.f41592k;
                    if (hVar5 != null) {
                        hVar5.b(message, itemView, new n(message, rVar, mVar, i13), new o(rVar, mVar, message, i10, 0), rVar.f41587f, z11);
                        View findViewById3 = itemView.findViewById(R.id.rl_document_container);
                        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                        rVar.w(message, mVar, i10, new n(message, rVar, mVar, i12), (ConstraintLayout) findViewById3);
                        ue.h hVar6 = rVar.f41592k;
                        if (hVar6 != null) {
                            ue.h.k(hVar6, message, itemView, false, false, true, 28);
                            return;
                        } else {
                            Intrinsics.k("chatMessageViewManager");
                            throw null;
                        }
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                return;
            }
            return;
        }
        if (rVar.f41592k != null) {
            ue.h.d(message, itemView, new o0(11, rVar, mVar, message), new o(rVar, mVar, message, i10, 2), false);
            ue.h hVar7 = rVar.f41592k;
            if (hVar7 != null) {
                ue.h.k(hVar7, message, itemView, false, false, false, 56);
                return;
            } else {
                Intrinsics.k("chatMessageViewManager");
                throw null;
            }
        }
        Intrinsics.k("chatMessageViewManager");
        throw null;
    }

    @Override // k7.z0
    public final int a() {
        return this.f41586e.size();
    }

    @Override // k7.z0
    public final long b(int i10) {
        return i10;
    }

    @Override // k7.z0
    public final int c(int i10) {
        ChatMessage chatMessage = (ChatMessage) this.f41586e.get(i10);
        if (!chatMessage.isReported() && !chatMessage.isSenderReported()) {
            if (u(chatMessage)) {
                ThreadInfo threadInfo = chatMessage.getThreadInfo();
                if (threadInfo != null && threadInfo.getNoOfReplies() > 0) {
                    return 3;
                }
                return 1;
            }
            ThreadInfo threadInfo2 = chatMessage.getThreadInfo();
            if (threadInfo2 != null && threadInfo2.getNoOfReplies() > 0) {
                return 4;
            }
            return 2;
        }
        if (u(chatMessage)) {
            return 5;
        }
        return 6;
    }

    @Override // k7.z0
    public final void h(y1 holder, int i10) {
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ChatMessage chatMessage;
        int i11;
        j jVar;
        rd.m mVar;
        ChatMessage latestMessage;
        int i12;
        String str;
        String str2;
        ChatMessage latestMessage2;
        Object obj5;
        Object obj6;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        ThreadInfo threadInfo;
        ChatMessage latestMessage3;
        ThreadInfo threadInfo2;
        ChatMessage latestMessage4;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ChatMessage chatMessage2 = (ChatMessage) this.f41586e.get(i10);
        ThreadInfo threadInfo3 = chatMessage2.getThreadInfo();
        if (threadInfo3 != null && threadInfo3.getNoOfReplies() > 0 && (threadInfo2 = chatMessage2.getThreadInfo()) != null && (latestMessage4 = threadInfo2.getLatestMessage()) != null) {
            chatMessage2 = latestMessage4;
        }
        int i15 = 0;
        if (i10 < this.f41586e.size() - 1) {
            int i16 = i10 + 1;
            ChatMessage chatMessage3 = (ChatMessage) this.f41586e.get(i16);
            ThreadInfo threadInfo4 = chatMessage3.getThreadInfo();
            if (threadInfo4 != null && threadInfo4.getNoOfReplies() > 0 && (threadInfo = chatMessage3.getThreadInfo()) != null && (latestMessage3 = threadInfo.getLatestMessage()) != null) {
                chatMessage3 = latestMessage3;
            }
            Long serverTime = chatMessage2.getServerTime();
            if (serverTime != null) {
                long longValue = serverTime.longValue();
                Long serverTime2 = chatMessage3.getServerTime();
                if (serverTime2 != null) {
                    long longValue2 = serverTime2.longValue();
                    long j10 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    String a10 = jv.a.b("MMM d").a(hv.g.v(hv.e.n(longValue / j10), hv.q.p()));
                    Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
                    String a11 = jv.a.b("MMM d").a(hv.g.v(hv.e.n(longValue2 / j10), hv.q.p()));
                    Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
                    if (!Intrinsics.a(a10, a11)) {
                        z13 = true;
                        z12 = false;
                    } else if (this.f41592k != null) {
                        ChatMessage chatMessage4 = (ChatMessage) this.f41586e.get(i16);
                        if (chatMessage4 != null) {
                            String senderId = chatMessage2.getSenderId();
                            String senderId2 = chatMessage4.getSenderId();
                            ThreadInfo threadInfo5 = chatMessage4.getThreadInfo();
                            if (threadInfo5 != null && threadInfo5.getNoOfReplies() > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (kotlin.text.s.j(senderId, senderId2, false) && !z14) {
                                z12 = true;
                                z13 = false;
                            }
                        }
                        z12 = false;
                        z13 = false;
                    } else {
                        Intrinsics.k("chatMessageViewManager");
                        throw null;
                    }
                } else {
                    z12 = false;
                    z13 = false;
                }
                z11 = z12;
                z10 = z13;
            }
            z11 = false;
            z10 = false;
        } else {
            if (i10 == this.f41586e.size() - 1) {
                z10 = true;
                z11 = false;
            }
            z11 = false;
            z10 = false;
        }
        switch (holder.f22634f) {
            case 1:
                boolean z15 = z11;
                k kVar = (k) holder;
                ChatMessage chatMessage5 = (ChatMessage) this.f41586e.get(i10);
                rd.m mVar2 = this.f41591j;
                ArrayList arrayList = this.f41586e;
                int i17 = i10 - 1;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    obj = arrayList.get(i17);
                } else {
                    obj = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj);
                kVar.u(chatMessage5, i10, z15, z10, mVar2);
                return;
            case 2:
                boolean z16 = z11;
                h hVar = (h) holder;
                ChatMessage chatMessage6 = (ChatMessage) this.f41586e.get(i10);
                rd.m mVar3 = this.f41591j;
                ArrayList arrayList2 = this.f41586e;
                int i18 = i10 - 1;
                if (i18 >= 0 && i18 < arrayList2.size()) {
                    obj2 = arrayList2.get(i18);
                } else {
                    obj2 = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj2);
                hVar.u(chatMessage6, i10, z16, z10, mVar3);
                return;
            case 3:
                boolean z17 = z11;
                m mVar4 = (m) holder;
                ChatMessage chatMessage7 = (ChatMessage) this.f41586e.get(i10);
                rd.m mVar5 = this.f41591j;
                ArrayList arrayList3 = this.f41586e;
                int i19 = i10 - 1;
                if (i19 >= 0 && i19 < arrayList3.size()) {
                    obj3 = arrayList3.get(i19);
                } else {
                    obj3 = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj3);
                mVar4.u(chatMessage7, i10, z17, z10, mVar5);
                return;
            case 4:
                j jVar2 = (j) holder;
                ChatMessage message = (ChatMessage) this.f41586e.get(i10);
                rd.m mVar6 = this.f41591j;
                ArrayList arrayList4 = this.f41586e;
                int i20 = i10 - 1;
                if (i20 >= 0 && i20 < arrayList4.size()) {
                    obj4 = arrayList4.get(i20);
                } else {
                    obj4 = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj4);
                Intrinsics.checkNotNullParameter(message, "message");
                gx gxVar = (gx) jVar2.f41556u;
                gxVar.E = message;
                synchronized (gxVar) {
                    gxVar.I |= 32;
                }
                gxVar.a(16);
                gxVar.m();
                fx fxVar = jVar2.f41556u;
                ThreadInfo threadInfo6 = message.getThreadInfo();
                if (threadInfo6 != null) {
                    chatMessage = threadInfo6.getLatestMessage();
                } else {
                    chatMessage = null;
                }
                gx gxVar2 = (gx) fxVar;
                gxVar2.F = chatMessage;
                synchronized (gxVar2) {
                    gxVar2.I |= 16;
                }
                int i21 = 4;
                gxVar2.a(4);
                gxVar2.m();
                ue.h hVar2 = jVar2.f41558w.f41592k;
                if (hVar2 != null) {
                    TextView groupChatChildMessageSenderName = jVar2.f41556u.f4756s;
                    Intrinsics.checkNotNullExpressionValue(groupChatChildMessageSenderName, "groupChatChildMessageSenderName");
                    hVar2.j(groupChatChildMessageSenderName);
                    boolean z18 = jVar2.f41558w.f41588g;
                    if (z18 && !z11) {
                        jVar2.f41556u.f4762y.setVisibility(0);
                        ImageView imageGroupChatProfile = jVar2.f41556u.f4757t;
                        Intrinsics.checkNotNullExpressionValue(imageGroupChatProfile, "imageGroupChatProfile");
                        ThreadInfo threadInfo7 = message.getThreadInfo();
                        if (threadInfo7 != null && (latestMessage2 = threadInfo7.getLatestMessage()) != null) {
                            str2 = latestMessage2.getSenderPicture();
                        } else {
                            str2 = null;
                        }
                        zq.f.X(imageGroupChatProfile, str2, R.drawable.ic_placeholder_user);
                    } else {
                        RelativeLayout relativeLayout = jVar2.f41556u.f4762y;
                        if (z18) {
                            i11 = 4;
                        } else {
                            i11 = 8;
                        }
                        relativeLayout.setVisibility(i11);
                    }
                    jVar2.f41556u.f4758u.f27491e.setElevation(10.0f);
                    ImageView imageView = jVar2.f41556u.f4759v;
                    if (!z11) {
                        i21 = 0;
                    }
                    imageView.setVisibility(i21);
                    r rVar = jVar2.f41558w;
                    View itemView = jVar2.f22629a;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(itemView, "itemView");
                    Intrinsics.checkNotNullParameter(message, "message");
                    View findViewById = itemView.findViewById(R.id.layout_message_text);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    View findViewById2 = ((LinearLayout) findViewById).findViewById(R.id.text_group_chat_message);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    View findViewById3 = itemView.findViewById(R.id.message_container);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                    View findViewById4 = itemView.findViewById(R.id.layout_thread_info);
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                    LinearLayout linearLayout = (LinearLayout) findViewById4;
                    View findViewById5 = itemView.findViewById(R.id.label_show_thread);
                    Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                    TextView textView = (TextView) findViewById5;
                    View findViewById6 = itemView.findViewById(R.id.label_no_of_replies);
                    Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                    TextView textView2 = (TextView) findViewById6;
                    View findViewById7 = itemView.findViewById(R.id.message_footer_layout);
                    Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
                    View findViewById8 = itemView.findViewById(R.id.selection_layer);
                    Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
                    boolean z19 = z11;
                    rVar.w(message, mVar6, i10, d.f41533g, (ConstraintLayout) findViewById7, findViewById3, (TextView) findViewById2);
                    if (rVar.f41592k != null) {
                        ue.h.f(itemView, message, z10);
                        if (rVar.f41592k != null) {
                            ue.h.g(itemView, message);
                            ThreadInfo threadInfo8 = message.getThreadInfo();
                            if (threadInfo8 != null) {
                                int noOfReplies = threadInfo8.getNoOfReplies();
                                if (noOfReplies > 0) {
                                    i12 = 0;
                                } else {
                                    i12 = 8;
                                }
                                textView2.setVisibility(i12);
                                if (noOfReplies > 1) {
                                    str = noOfReplies + " Replies";
                                } else {
                                    str = "1 Reply";
                                }
                                textView2.setText(str);
                            }
                            rVar.y(findViewById8, i10);
                            linearLayout.setOnClickListener(new g(rVar, mVar6, message, i10, 1));
                            textView.setOnClickListener(new g(rVar, mVar6, message, i10, 2));
                            ThreadInfo threadInfo9 = message.getThreadInfo();
                            if (threadInfo9 != null && (latestMessage = threadInfo9.getLatestMessage()) != null) {
                                jVar = jVar2;
                                r rVar2 = jVar.f41558w;
                                View view = jVar.f41556u.f4763z.f27491e;
                                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                                mVar = mVar6;
                                s(rVar2, view, latestMessage, i10, mVar6, false, 16);
                                Long serverTime3 = latestMessage.getServerTime();
                                if (serverTime3 != null) {
                                    jVar.f41557v.setText(pp.b.y(serverTime3.longValue()));
                                }
                            } else {
                                jVar = jVar2;
                                mVar = mVar6;
                            }
                            ue.h hVar3 = jVar.f41558w.f41592k;
                            if (hVar3 != null) {
                                ConstraintLayout layoutChatMessage = jVar.f41556u.f4760w;
                                Intrinsics.checkNotNullExpressionValue(layoutChatMessage, "layoutChatMessage");
                                hVar3.m(layoutChatMessage, z10, z19);
                                jVar.f41556u.A.f6491v.setOnClickListener(new g(jVar.f41558w, mVar, message, i10, 6));
                                rd.m mVar7 = mVar;
                                jVar.f41556u.f4756s.setOnClickListener(new g(message, jVar.f41558w, mVar7, i10, 7));
                                jVar.f41556u.f4762y.setOnClickListener(new g(message, jVar.f41558w, mVar7, i10, 8));
                                r rVar3 = jVar.f41558w;
                                d dVar = d.f41530d;
                                View itemView2 = jVar.f22629a;
                                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                                rVar3.w(message, mVar, i10, dVar, itemView2);
                                return;
                            }
                            Intrinsics.k("chatMessageViewManager");
                            throw null;
                        }
                        Intrinsics.k("chatMessageViewManager");
                        throw null;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
            case 5:
                l lVar = (l) holder;
                ChatMessage message2 = (ChatMessage) this.f41586e.get(i10);
                ArrayList arrayList5 = this.f41586e;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList5.size()) {
                    obj5 = arrayList5.get(i22);
                } else {
                    obj5 = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj5);
                Intrinsics.checkNotNullParameter(message2, "message");
                yw ywVar = (yw) lVar.f41561u;
                ywVar.f6698w = message2;
                synchronized (ywVar) {
                    ywVar.f6787y |= 4;
                }
                ywVar.a(14);
                ywVar.m();
                lVar.f41561u.f6696u.f6484s.setBackground(r3.k.getDrawable(lVar.f22629a.getContext(), R.drawable.background_chat_message_sender));
                ImageView imageView2 = lVar.f41561u.f6694s;
                if (z11) {
                    i15 = 4;
                }
                imageView2.setVisibility(i15);
                ue.h hVar4 = lVar.f41562v.f41592k;
                if (hVar4 != null) {
                    ConstraintLayout messageContainer = lVar.f41561u.f6697v;
                    Intrinsics.checkNotNullExpressionValue(messageContainer, "messageContainer");
                    hVar4.m(messageContainer, z10, z11);
                    lVar.f41561u.f6697v.setElevation(2.0f);
                    View findViewById9 = lVar.f22629a.findViewById(R.id.text_group_chat_message);
                    Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
                    TextView textView3 = (TextView) findViewById9;
                    if (message2.isReported()) {
                        textView3.setText(lVar.f41562v.f41585d.getString(R.string.text_me_reported_message_explanation));
                    }
                    if (message2.isSenderReported()) {
                        textView3.setText(lVar.f41562v.f41585d.getString(R.string.text_reported_user_explanation));
                    }
                    if (lVar.f41562v.f41592k != null) {
                        View itemView3 = lVar.f22629a;
                        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                        ue.h.f(itemView3, message2, z10);
                        return;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
            case 6:
                i iVar = (i) holder;
                ChatMessage message3 = (ChatMessage) this.f41586e.get(i10);
                rd.m mVar8 = this.f41591j;
                ArrayList arrayList6 = this.f41586e;
                int i23 = i10 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    obj6 = arrayList6.get(i23);
                } else {
                    obj6 = (ChatMessage) this.f41586e.get(i10);
                }
                u((ChatMessage) obj6);
                Intrinsics.checkNotNullParameter(message3, "message");
                ax axVar = (ax) iVar.f41553u;
                axVar.f6901z = message3;
                synchronized (axVar) {
                    axVar.B |= 4;
                }
                axVar.a(14);
                axVar.m();
                iVar.f41553u.f6900y.f6484s.setBackground(r3.k.getDrawable(iVar.f22629a.getContext(), R.drawable.background_chat_message_other_rounded));
                ImageView imageView3 = iVar.f41553u.f6895t;
                if (z11) {
                    i13 = 4;
                } else {
                    i13 = 0;
                }
                imageView3.setVisibility(i13);
                ue.h hVar5 = iVar.f41554v.f41592k;
                if (hVar5 != null) {
                    ConstraintLayout layoutChatMessage2 = iVar.f41553u.f6896u;
                    Intrinsics.checkNotNullExpressionValue(layoutChatMessage2, "layoutChatMessage");
                    hVar5.m(layoutChatMessage2, z10, z11);
                    iVar.f41553u.f6896u.setElevation(2.0f);
                    boolean z20 = iVar.f41554v.f41588g;
                    if (z20 && !z11) {
                        iVar.f41553u.f6898w.setVisibility(0);
                        ImageView imageGroupChatProfile2 = iVar.f41553u.f6894s;
                        Intrinsics.checkNotNullExpressionValue(imageGroupChatProfile2, "imageGroupChatProfile");
                        zq.f.X(imageGroupChatProfile2, message3.getSenderPicture(), R.drawable.ic_placeholder_user);
                    } else {
                        RelativeLayout relativeLayout2 = iVar.f41553u.f6898w;
                        if (z20) {
                            i14 = 4;
                        } else {
                            i14 = 8;
                        }
                        relativeLayout2.setVisibility(i14);
                    }
                    View findViewById10 = iVar.f22629a.findViewById(R.id.layout_chat_message);
                    Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById10;
                    View findViewById11 = iVar.f22629a.findViewById(R.id.text_group_chat_message);
                    Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
                    TextView textView4 = (TextView) findViewById11;
                    if (message3.isReported()) {
                        textView4.setText(iVar.f41554v.f41585d.getString(R.string.text_reported_message_explanation));
                    }
                    if (message3.isSenderReported()) {
                        textView4.setText(iVar.f41554v.f41585d.getString(R.string.text_reported_user_explanation));
                    }
                    if (iVar.f41554v.f41592k != null) {
                        View itemView4 = iVar.f22629a;
                        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                        ue.h.f(itemView4, message3, z10);
                        r rVar4 = iVar.f41554v;
                        View itemView5 = iVar.f22629a;
                        Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
                        rVar4.t(itemView5, message3, mVar8, constraintLayout, z11, i10);
                        return;
                    }
                    Intrinsics.k("chatMessageViewManager");
                    throw null;
                }
                Intrinsics.k("chatMessageViewManager");
                throw null;
            default:
                return;
        }
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i10) {
            case 1:
                LayoutInflater from = LayoutInflater.from(parent.getContext());
                int i11 = rw.A;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                rw rwVar = (rw) m4.m.g(from, R.layout.list_item_chat_message_me, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(rwVar, "inflate(...)");
                return new k(this, rwVar);
            case 2:
                LayoutInflater from2 = LayoutInflater.from(parent.getContext());
                int i12 = tw.A;
                DataBinderMapperImpl dataBinderMapperImpl2 = m4.d.f27474a;
                tw twVar = (tw) m4.m.g(from2, R.layout.list_item_chat_message_other, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(twVar, "inflate(...)");
                return new h(this, twVar);
            case 3:
                LayoutInflater from3 = LayoutInflater.from(parent.getContext());
                int i13 = dx.E;
                DataBinderMapperImpl dataBinderMapperImpl3 = m4.d.f27474a;
                dx dxVar = (dx) m4.m.g(from3, R.layout.list_item_group_chat_thread_user_me, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(dxVar, "inflate(...)");
                return new m(this, dxVar);
            case 4:
                LayoutInflater from4 = LayoutInflater.from(parent.getContext());
                int i14 = fx.G;
                DataBinderMapperImpl dataBinderMapperImpl4 = m4.d.f27474a;
                fx fxVar = (fx) m4.m.g(from4, R.layout.list_item_group_chat_thread_user_other, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(fxVar, "inflate(...)");
                return new j(this, fxVar);
            case 5:
                LayoutInflater from5 = LayoutInflater.from(parent.getContext());
                int i15 = xw.f6693x;
                DataBinderMapperImpl dataBinderMapperImpl5 = m4.d.f27474a;
                xw xwVar = (xw) m4.m.g(from5, R.layout.list_item_chat_reported_message_me, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(xwVar, "inflate(...)");
                return new l(this, xwVar);
            case 6:
                LayoutInflater from6 = LayoutInflater.from(parent.getContext());
                int i16 = zw.A;
                DataBinderMapperImpl dataBinderMapperImpl6 = m4.d.f27474a;
                zw zwVar = (zw) m4.m.g(from6, R.layout.list_item_chat_reported_message_other, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(zwVar, "inflate(...)");
                return new i(this, zwVar);
            default:
                LayoutInflater from7 = LayoutInflater.from(parent.getContext());
                int i17 = rw.A;
                DataBinderMapperImpl dataBinderMapperImpl7 = m4.d.f27474a;
                rw rwVar2 = (rw) m4.m.g(from7, R.layout.list_item_chat_message_me, parent, false, null);
                Intrinsics.checkNotNullExpressionValue(rwVar2, "inflate(...)");
                return new k(this, rwVar2);
        }
    }

    public final void q(ChatMessage chatMessage, boolean z10) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        int i10 = 0;
        Integer num = 0;
        Iterator it = this.f41586e.iterator();
        ChatMessage chatMessage2 = null;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                ChatMessage chatMessage3 = (ChatMessage) next;
                if (Intrinsics.a(chatMessage3.getMessageId(), chatMessage.getMessageId())) {
                    num = Integer.valueOf(i10);
                    chatMessage2 = chatMessage3;
                }
                i10 = i11;
            } else {
                y.j();
                throw null;
            }
        }
        if (chatMessage2 != null) {
            if (chatMessage2.getMessageInteraction() != null) {
                MessageInteraction messageInteraction = chatMessage2.getMessageInteraction();
                if (messageInteraction != null) {
                    messageInteraction.setPinned(z10);
                }
            } else {
                chatMessage2.setMessageInteraction(new MessageInteraction(Boolean.FALSE, z10));
            }
            e(num.intValue());
        }
    }

    public final void r() {
        Iterator it = this.f41589h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            int intValue = ((Number) next).intValue();
            it.remove();
            e(intValue);
        }
    }

    public final void t(View itemView, ChatMessage message, rd.m mVar, ConstraintLayout messageCard, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageCard, "messageCard");
        View findViewById = itemView.findViewById(R.id.group_chat_sender_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        if (this.f41588g && !z10) {
            textView.setVisibility(0);
            textView.setText(message.getSenderName());
            ue.h hVar = this.f41592k;
            if (hVar != null) {
                hVar.j(textView);
            } else {
                Intrinsics.k("chatMessageViewManager");
                throw null;
            }
        } else {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(new g(this, mVar, message, i10, 0));
    }

    public final boolean u(ChatMessage chatMessage) {
        String str = this.f41587f;
        if (str != null) {
            return Intrinsics.a(str, chatMessage.getSenderId());
        }
        return false;
    }

    public final void v(int i10, ChatMessage message, rd.m mVar) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!message.isReported()) {
            HashSet hashSet = this.f41589h;
            if (hashSet.contains(Integer.valueOf(i10))) {
                hashSet.remove(Integer.valueOf(i10));
                e(i10);
                if (mVar != null) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    GroupChatViewModel groupChatViewModel = (GroupChatViewModel) mVar.f33634a.r();
                    Intrinsics.checkNotNullParameter(message, "message");
                    if (groupChatViewModel.f9194w0 != 0) {
                        groupChatViewModel.f9199z.remove(message);
                        int i11 = groupChatViewModel.f9194w0 - 1;
                        groupChatViewModel.f9194w0 = i11;
                        groupChatViewModel.Z.postValue(Integer.valueOf(i11));
                        return;
                    }
                    return;
                }
                return;
            }
            hashSet.add(Integer.valueOf(i10));
            e(i10);
            if (mVar != null) {
                Intrinsics.checkNotNullParameter(message, "message");
                GroupChatViewModel groupChatViewModel2 = (GroupChatViewModel) mVar.f33634a.r();
                Intrinsics.checkNotNullParameter(message, "message");
                groupChatViewModel2.f9199z.add(message);
                int i12 = groupChatViewModel2.f9194w0 + 1;
                groupChatViewModel2.f9194w0 = i12;
                groupChatViewModel2.Z.postValue(Integer.valueOf(i12));
            }
        }
    }

    public final void w(ChatMessage message, rd.m mVar, int i10, Function1 performSpecificAction, View... views) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(performSpecificAction, "performSpecificAction");
        Intrinsics.checkNotNullParameter(views, "views");
        for (View view : views) {
            view.setOnTouchListener(new ha.g(new GestureDetector(view.getContext(), new q(this, message, mVar, i10, performSpecificAction)), 2));
        }
    }

    public final void x(int i10, boolean z10) {
        ChatMessage chatMessage = (ChatMessage) this.f41586e.get(i10);
        if (chatMessage.getMessageInteraction() != null) {
            MessageInteraction messageInteraction = chatMessage.getMessageInteraction();
            if (messageInteraction != null) {
                messageInteraction.setLiked(Boolean.valueOf(z10));
            }
        } else {
            chatMessage.setMessageInteraction(new MessageInteraction(Boolean.valueOf(z10), false, 2, null));
        }
        if (z10) {
            chatMessage.setTotalLikes(chatMessage.getTotalLikes() + 1);
        } else {
            chatMessage.setTotalLikes(chatMessage.getTotalLikes() - 1);
        }
        e(i10);
    }

    public final void y(View view, int i10) {
        int color;
        boolean contains = this.f41589h.contains(Integer.valueOf(i10));
        Context context = this.f41585d;
        if (contains) {
            color = r3.k.getColor(context, R.color.message_select_background_color);
        } else {
            color = r3.k.getColor(context, R.color.stream_transparent);
        }
        view.setBackgroundColor(color);
    }
}
