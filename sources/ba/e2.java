package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import com.assetgro.stockgro.widget.ChatImageView;

/* loaded from: classes.dex */
public abstract class e2 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4558s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4559t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f4560u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4561v;

    /* renamed from: w, reason: collision with root package name */
    public final ChatImageView f4562w;

    /* renamed from: x, reason: collision with root package name */
    public final ev f4563x;

    /* renamed from: y, reason: collision with root package name */
    public final VideoPlayer f4564y;

    public e2(Object obj, View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, ChatImageView chatImageView, ev evVar, VideoPlayer videoPlayer) {
        super(obj, view, 1);
        this.f4558s = imageView;
        this.f4559t = textView;
        this.f4560u = constraintLayout;
        this.f4561v = textView2;
        this.f4562w = chatImageView;
        this.f4563x = evVar;
        this.f4564y = videoPlayer;
    }
}
