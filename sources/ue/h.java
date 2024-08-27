package ue;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.MentionsInfo;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.data.model.UserInfo;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.d;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37090a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f37091b;

    public h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37090a = context;
        this.f37091b = vt.y.c(Integer.valueOf(R.color.green_19A574), Integer.valueOf(R.color.red_FF2525), Integer.valueOf(R.color.orange_new));
    }

    public static SpannableString a(ChatMessage chatMessage, String str, Function2 function2) {
        ArrayList<UserInfo> arrayList;
        SpannableString spannableString = new SpannableString(str);
        MentionsInfo mentionsInfo = chatMessage.getMentionsInfo();
        if (mentionsInfo != null) {
            arrayList = mentionsInfo.getUsersInfo();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                UserInfo userInfo = arrayList.get(i10);
                Intrinsics.checkNotNullExpressionValue(userInfo, "get(...)");
                UserInfo userInfo2 = userInfo;
                String uuid = userInfo2.getUuid();
                String f10 = a3.a.f("@", userInfo2.getUserName());
                int A = kotlin.text.w.A(str, f10, 0, false, 4);
                int i11 = 0;
                while (i11 < str.length() && A != -1 && (A = kotlin.text.w.A(str, f10, i11, false, 4)) != -1) {
                    spannableString.setSpan(new f(function2, uuid, userInfo2), A, f10.length() + A, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-16776961), A, f10.length() + A, 33);
                    i11 = A + 1;
                }
            }
        }
        return spannableString;
    }

    public static void d(ChatMessage message, View view, Function2 onMentionClicked, Function1 onLongPress, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onMentionClicked, "onMentionClicked");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        View findViewById = view.findViewById(R.id.text_group_chat_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        String message2 = message.getMessage();
        if (message2 == null) {
            message2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SpannableString a10 = a(message, message2, new pd.y(onMentionClicked, 7));
        if (!z10) {
            textView.setText(a10, TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            el.l.L0(textView, a10, 10, true, null);
        }
        if (!z10) {
            View findViewById2 = view.findViewById(R.id.text_group_chat_edited);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            TextView textView2 = (TextView) findViewById2;
            if (message.getEditedAt() != null) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView2.setVisibility(i10);
        }
    }

    public static void f(View itemView, ChatMessage message, boolean z10) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(message, "message");
        View findViewById = itemView.findViewById(R.id.card_view_group_chat_date);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        CardView cardView = (CardView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.text_group_chat_date);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        if (z10) {
            cardView.setVisibility(0);
            Long serverTime = message.getServerTime();
            if (serverTime != null) {
                textView.setText(pp.b.y(serverTime.longValue()));
                return;
            }
            return;
        }
        cardView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.view.View r6, com.assetgro.stockgro.data.model.ChatMessage r7) {
        /*
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 2131362834(0x7f0a0412, float:1.834546E38)
            android.view.View r0 = r6.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 2131363400(0x7f0a0648, float:1.8346608E38)
            android.view.View r2 = r6.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3 = 2131363103(0x7f0a051f, float:1.8346005E38)
            android.view.View r3 = r6.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131364721(0x7f0a0b71, float:1.8349287E38)
            android.view.View r6 = r6.findViewById(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            boolean r1 = r7.isPinned()
            r4 = 8
            r5 = 0
            if (r1 == 0) goto L47
            r1 = r5
            goto L48
        L47:
            r1 = r4
        L48:
            r0.setVisibility(r1)
            com.assetgro.stockgro.data.model.MessageInteraction r0 = r7.getMessageInteraction()
            if (r0 == 0) goto L62
            com.assetgro.stockgro.data.model.MessageInteraction r0 = r7.getMessageInteraction()
            kotlin.jvm.internal.Intrinsics.c(r0)
            boolean r0 = r0.getIsPinned()
            if (r0 == 0) goto L62
            r6.setVisibility(r5)
            goto L65
        L62:
            r6.setVisibility(r4)
        L65:
            int r6 = r7.getTotalLikes()
            if (r6 <= 0) goto L6d
            r6 = r5
            goto L6e
        L6d:
            r6 = r4
        L6e:
            r2.setVisibility(r6)
            int r6 = r7.getTotalLikes()
            r0 = 1
            if (r6 <= r0) goto L79
            r4 = r5
        L79:
            r3.setVisibility(r4)
            int r6 = r7.getTotalLikes()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.h.g(android.view.View, com.assetgro.stockgro.data.model.ChatMessage):void");
    }

    public static void i(ChatMessage chatMessage, ConstraintLayout view, int i10, ImageView chevron) {
        Sticker sticker;
        String sticker_id;
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        Media media = chatMessage.getMedia();
        if (media != null && (sticker = media.getSticker()) != null && (sticker_id = sticker.getSticker_id()) != null && (!kotlin.text.w.C(sticker_id))) {
            view.setBackgroundResource(android.R.color.transparent);
            chevron.setVisibility(4);
        } else {
            view.setBackgroundResource(i10);
        }
    }

    public static void k(h hVar, ChatMessage message, View itemView, boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.layout_message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = itemView.findViewById(R.id.layout_message_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = itemView.findViewById(R.id.layout_message_document);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        String message2 = message.getMessage();
        if (message2 != null && message2.length() != 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        findViewById.setVisibility(i11);
        if (!z10 && !z11) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        findViewById2.setVisibility(i12);
        if (!z12) {
            i13 = 8;
        }
        findViewById3.setVisibility(i13);
    }

    public static void l(ChatMessage chatMessage, TextView view, int i10) {
        Sticker sticker;
        String sticker_id;
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        Intrinsics.checkNotNullParameter(view, "view");
        Media media = chatMessage.getMedia();
        if (media != null && (sticker = media.getSticker()) != null && (sticker_id = sticker.getSticker_id()) != null && (!kotlin.text.w.C(sticker_id))) {
            view.setBackgroundResource(i10);
            view.setPadding(kj.f.j(8), kj.f.j(4), kj.f.j(8), kj.f.j(4));
            view.setElevation(2.0f);
            return;
        }
        view.setBackgroundResource(android.R.color.transparent);
    }

    public static void n(View view, ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (message != null && message.length() != 0) {
            View findViewById = view.findViewById(R.id.layout_message_text);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            findViewById.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.text_group_chat_message);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            TextView textView = (TextView) findViewById2;
            String message2 = chatMessage.getMessage();
            Intrinsics.c(message2);
            SpannableString a10 = a(chatMessage, message2, g.f37089a);
            textView.setText(a10, TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            el.l.L0(textView, a10, 10, true, null);
        }
    }

    public final void b(ChatMessage message, View view, Function1 onDocumentClicked, Function1 onLongPress, String str, boolean z10) {
        int i10;
        String str2;
        String url;
        String parentMessageId;
        String parentMessageId2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onDocumentClicked, "onDocumentClicked");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        View findViewById = view.findViewById(R.id.document_chat_file_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvDocumentName);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.rl_document_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById3;
        if (Intrinsics.a(str, message.getSenderId()) && ((parentMessageId = message.getParentMessageId()) == null || parentMessageId.length() == 0 || ((parentMessageId2 = message.getParentMessageId()) != null && parentMessageId2.length() != 0 && z10))) {
            i10 = R.color.purple_E2DCF5;
        } else {
            i10 = R.color.popup_background_color;
        }
        Context context = this.f37090a;
        constraintLayout.setBackgroundColor(r3.k.getColor(context, i10));
        view.setOnClickListener(new bb.a(8, message, onDocumentClicked));
        imageView.setOnLongClickListener(new d(onLongPress, message, 1));
        Media media = message.getMedia();
        if (media != null) {
            str2 = media.getFile_name();
        } else {
            str2 = null;
        }
        appCompatTextView.setText(str2);
        Media media2 = message.getMedia();
        if (media2 != null && (url = media2.getUrl()) != null) {
            if (kotlin.text.s.i(url, ".pdf", false)) {
                imageView.setImageDrawable(r3.k.getDrawable(context, R.drawable.ic_pdf_file_v2));
            } else {
                imageView.setImageDrawable(r3.k.getDrawable(context, R.drawable.ic_txt_file));
            }
        }
        n(view, message);
    }

    public final void c(ChatMessage message, View view, final Function1 onImageClicked, Function1 onLongPress) {
        final boolean z10;
        final String url;
        Sticker sticker;
        String sticker_id;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onImageClicked, "onImageClicked");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        Media media = message.getMedia();
        if (media != null && (sticker = media.getSticker()) != null && (sticker_id = sticker.getSticker_id()) != null && sticker_id.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Media media2 = message.getMedia();
        if (media2 != null) {
            url = media2.getUrl();
        } else {
            url = null;
        }
        View findViewById = view.findViewById(R.id.image_group_chat_file_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.sticker_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.msg_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        View findViewById4 = view.findViewById(R.id.play_video_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = view.findViewById(R.id.video_tint_layer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        findViewById5.setVisibility(8);
        kj.f.r(false, (ImageView) findViewById4, imageView, imageView2);
        if (url != null && url.length() != 0) {
            if (kotlin.text.s.i(url, ".gif", false)) {
                Context context = view.getContext();
                nk.a f10 = new nk.a().f(ak.p.f557c);
                Intrinsics.checkNotNullExpressionValue(f10, "diskCacheStrategy(...)");
                Intrinsics.c(context);
                com.bumptech.glide.g i10 = com.bumptech.glide.b.c(context).d(context).i(jk.c.class);
                nk.e eVar = com.bumptech.glide.h.f10819m;
                com.bumptech.glide.g gVar = (com.bumptech.glide.g) i10.w(eVar).k(Integer.MIN_VALUE, Integer.MIN_VALUE);
                gVar.F = url;
                gVar.J = true;
                com.bumptech.glide.g w10 = gVar.w((nk.e) f10);
                com.bumptech.glide.g w11 = com.bumptech.glide.b.c(context).d(context).i(jk.c.class).w(eVar);
                w11.F = HttpUrl.FRAGMENT_ENCODE_SET;
                w11.J = true;
                w10.H = w11;
                Intrinsics.c(imageView);
                w10.z(imageView);
            } else if (z10) {
                imageView.setVisibility(8);
                imageView2.setVisibility(0);
                Intrinsics.checkNotNullParameter(imageView2, "<this>");
                Intrinsics.checkNotNullParameter(url, "url");
                com.bumptech.glide.b.e(imageView2.getContext()).m(url).z(imageView2);
            } else {
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
                com.bumptech.glide.b.e(this.f37090a).m(url).z(imageView);
                progressBar.setVisibility(8);
            }
            progressBar.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
        }
        n(view, message);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ue.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                Function1 onImageClicked2 = onImageClicked;
                Intrinsics.checkNotNullParameter(onImageClicked2, "$onImageClicked");
                if (!z10 && (str = url) != null) {
                    onImageClicked2.invoke(str);
                }
            }
        });
        imageView.setOnLongClickListener(new d(onLongPress, message, 2));
    }

    public final void e(ChatMessage message, View view, final Function1 onVideoClicked, Function1 onLongPress) {
        final String url;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onVideoClicked, "onVideoClicked");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        View findViewById = view.findViewById(R.id.image_group_chat_file_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.sticker_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = view.findViewById(R.id.msg_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        View findViewById4 = view.findViewById(R.id.play_video_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.video_tint_layer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        final int i10 = 0;
        findViewById5.setVisibility(0);
        final int i11 = 1;
        kj.f.r(false, (ImageView) findViewById2);
        kj.f.r(true, imageView2, imageView);
        Media media = message.getMedia();
        if (media != null && (url = media.getUrl()) != null) {
            if (url.length() == 0) {
                progressBar.setVisibility(0);
            } else {
                progressBar.setVisibility(8);
                try {
                    nk.a t10 = new nk.a().t(new xj.h(new hk.w(kj.f.j(8))), true);
                    Intrinsics.checkNotNullExpressionValue(t10, "transforms(...)");
                    com.bumptech.glide.b.e(this.f37090a).m(url).w((nk.e) t10).z(imageView);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            n(view, message);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: ue.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    String url2 = url;
                    Function1 onVideoClicked2 = onVideoClicked;
                    switch (i12) {
                        case 0:
                            Intrinsics.checkNotNullParameter(onVideoClicked2, "$onVideoClicked");
                            Intrinsics.checkNotNullParameter(url2, "$url");
                            onVideoClicked2.invoke(url2);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(onVideoClicked2, "$onVideoClicked");
                            Intrinsics.checkNotNullParameter(url2, "$url");
                            onVideoClicked2.invoke(url2);
                            return;
                    }
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ue.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i11;
                    String url2 = url;
                    Function1 onVideoClicked2 = onVideoClicked;
                    switch (i12) {
                        case 0:
                            Intrinsics.checkNotNullParameter(onVideoClicked2, "$onVideoClicked");
                            Intrinsics.checkNotNullParameter(url2, "$url");
                            onVideoClicked2.invoke(url2);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(onVideoClicked2, "$onVideoClicked");
                            Intrinsics.checkNotNullParameter(url2, "$url");
                            onVideoClicked2.invoke(url2);
                            return;
                    }
                }
            });
            imageView.setOnLongClickListener(new d(onLongPress, message, 0));
        }
    }

    public final void h(ChatMessage message, View view, Function2 onMentionClicked, Function1 onImageClicked, Function1 onVideoClicked, Function1 onDocumentClicked, Function1 onLongPress, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onMentionClicked, "onMentionClicked");
        Intrinsics.checkNotNullParameter(onImageClicked, "onImageClicked");
        Intrinsics.checkNotNullParameter(onVideoClicked, "onVideoClicked");
        Intrinsics.checkNotNullParameter(onDocumentClicked, "onDocumentClicked");
        Intrinsics.checkNotNullParameter(onLongPress, "onLongPress");
        if (message.getMedia() != null) {
            String type = message.getMedia().getType();
            if (type != null) {
                k(this, message, view, true, false, false, 52);
                if (kotlin.text.w.s(type, "image", false)) {
                    c(message, view, onImageClicked, onLongPress);
                    return;
                }
                if (kotlin.text.w.s(type, "video", false)) {
                    k(this, message, view, false, true, false, 44);
                    e(message, view, onVideoClicked, onLongPress);
                    return;
                } else {
                    if (kotlin.text.w.s(type, "document", false)) {
                        k(this, message, view, false, false, true, 28);
                        b(message, view, onDocumentClicked, onLongPress, str, z10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        k(this, message, view, false, false, false, 56);
        d(message, view, onMentionClicked, onLongPress, false);
    }

    public final void j(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        d.Companion companion = lu.d.INSTANCE;
        ArrayList arrayList = this.f37091b;
        int size = arrayList.size();
        companion.getClass();
        Object obj = arrayList.get(lu.d.f25398b.c(size));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        a3.a.s(textView, ((Number) obj).intValue());
    }

    public final void m(ConstraintLayout view, boolean z10, boolean z11) {
        float applyDimension;
        int i10;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = this.f37090a;
        if (z11) {
            applyDimension = TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics());
        } else {
            if (z10) {
                i10 = 0;
                kj.f.q(view, 0, i10, 0, 0, -1, -1);
            }
            applyDimension = TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics());
        }
        i10 = (int) applyDimension;
        kj.f.q(view, 0, i10, 0, 0, -1, -1);
    }
}
