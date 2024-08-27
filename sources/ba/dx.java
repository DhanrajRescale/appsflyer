package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class dx extends m4.m {
    public static final /* synthetic */ int E = 0;
    public final ConstraintLayout A;
    public final TextView B;
    public ChatMessage C;
    public ChatMessage D;

    /* renamed from: s, reason: collision with root package name */
    public final TextView f4536s;

    /* renamed from: t, reason: collision with root package name */
    public final pw f4537t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4538u;

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f4539v;

    /* renamed from: w, reason: collision with root package name */
    public final bx f4540w;

    /* renamed from: x, reason: collision with root package name */
    public final c8 f4541x;

    /* renamed from: y, reason: collision with root package name */
    public final vx f4542y;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCardView f4543z;

    public dx(Object obj, View view, TextView textView, pw pwVar, ImageView imageView, ConstraintLayout constraintLayout, bx bxVar, c8 c8Var, vx vxVar, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, TextView textView2) {
        super(obj, view, 4);
        this.f4536s = textView;
        this.f4537t = pwVar;
        this.f4538u = imageView;
        this.f4539v = constraintLayout;
        this.f4540w = bxVar;
        this.f4541x = c8Var;
        this.f4542y = vxVar;
        this.f4543z = materialCardView;
        this.A = constraintLayout2;
        this.B = textView2;
    }
}
