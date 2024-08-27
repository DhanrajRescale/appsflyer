package com.assetgro.stockgro.ui.chat.preview;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import ba.e2;
import bb.a;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.widget.ChatImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import kj.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import ls.n0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/preview/MediaAssetUploadPreviewActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/detail/group/GroupChatViewModel;", "Lba/e2;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MediaAssetUploadPreviewActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9422k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_media_asset_upload_preview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [fi.g, java.lang.Object] */
    @Override // gd.b
    public final void I() {
        String str;
        String str2;
        Bundle extras = getIntent().getExtras();
        String str3 = null;
        if (extras != null) {
            str = extras.getString("URI");
        } else {
            str = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            str3 = extras2.getString("GROUP_NAME");
        }
        ((e2) w()).f4559t.setText(str3);
        ((e2) w()).f4563x.f4649v.getEditText().setHint(getString(R.string.placeholder_write_here));
        if (str != null) {
            String type = getContentResolver().getType(Uri.parse(str));
            if (type != null && s.r(type, "image", false)) {
                str2 = "Image";
            } else if (type != null && s.r(type, "video", false)) {
                str2 = "Video";
            } else if (type != null && w.s(type, "pdf", false)) {
                str2 = "PDF";
            } else {
                str2 = "Unknown";
            }
            int hashCode = str2.hashCode();
            if (hashCode != 79058) {
                if (hashCode != 70760763) {
                    if (hashCode == 82650203 && str2.equals("Video")) {
                        ChatImageView imageHolder = ((e2) w()).f4562w;
                        Intrinsics.checkNotNullExpressionValue(imageHolder, "imageHolder");
                        hide(imageHolder);
                        ((e2) w()).f4560u.setVisibility(8);
                        ((e2) w()).f4564y.setVisibility(0);
                        ((e2) w()).f4564y.h(str, false);
                        ((e2) w()).f4564y.i();
                        ((e2) w()).f4564y.setOnVideoPlayerAction(new Object());
                    }
                } else if (str2.equals("Image")) {
                    ChatImageView imageHolder2 = ((e2) w()).f4562w;
                    Intrinsics.checkNotNullExpressionValue(imageHolder2, "imageHolder");
                    show(imageHolder2);
                    ((e2) w()).f4564y.setVisibility(8);
                    ((e2) w()).f4560u.setVisibility(8);
                    ((e2) w()).f4562w.setImageURI(Uri.parse(str));
                }
            } else if (str2.equals("PDF")) {
                ChatImageView imageHolder3 = ((e2) w()).f4562w;
                Intrinsics.checkNotNullExpressionValue(imageHolder3, "imageHolder");
                hide(imageHolder3);
                ((e2) w()).f4560u.setVisibility(0);
                ((e2) w()).f4564y.setVisibility(8);
                ((e2) w()).f4561v.setText(vl.b.x(this, Uri.parse(str)));
            }
        }
        ((e2) w()).f4563x.f4647t.setOnClickListener(new a(7, this, str));
        ImageButton buttonGroupChatUpload = ((e2) w()).f4563x.f4648u;
        Intrinsics.checkNotNullExpressionValue(buttonGroupChatUpload, "buttonGroupChatUpload");
        ImageButton addSticker = ((e2) w()).f4563x.f4646s;
        Intrinsics.checkNotNullExpressionValue(addSticker, "addSticker");
        f.r(false, buttonGroupChatUpload, addSticker);
        ((e2) w()).f4558s.setOnClickListener(new jd.a(this, 16));
        getWindow().addFlags(128);
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((e2) w()).f4564y.j();
    }

    @Override // h.m, androidx.fragment.app.j0, android.app.Activity
    public final void onStop() {
        super.onStop();
        ((e2) w()).f4564y.j();
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.f();
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
