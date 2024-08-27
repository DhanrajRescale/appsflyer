package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class tw extends m4.m {
    public static final /* synthetic */ int A = 0;

    /* renamed from: s, reason: collision with root package name */
    public final c8 f6240s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6241t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6242u;

    /* renamed from: v, reason: collision with root package name */
    public final bx f6243v;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f6244w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6245x;

    /* renamed from: y, reason: collision with root package name */
    public final pw f6246y;

    /* renamed from: z, reason: collision with root package name */
    public ChatMessage f6247z;

    public tw(Object obj, View view, c8 c8Var, ImageView imageView, ConstraintLayout constraintLayout, bx bxVar, RelativeLayout relativeLayout, TextView textView, pw pwVar) {
        super(obj, view, 3);
        this.f6240s = c8Var;
        this.f6241t = imageView;
        this.f6242u = constraintLayout;
        this.f6243v = bxVar;
        this.f6244w = relativeLayout;
        this.f6245x = textView;
        this.f6246y = pwVar;
    }
}
