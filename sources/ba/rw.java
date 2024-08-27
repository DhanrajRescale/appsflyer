package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class rw extends m4.m {
    public static final /* synthetic */ int A = 0;

    /* renamed from: s, reason: collision with root package name */
    public final c8 f6015s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6016t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f6017u;

    /* renamed from: v, reason: collision with root package name */
    public final bx f6018v;

    /* renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f6019w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f6020x;

    /* renamed from: y, reason: collision with root package name */
    public final pw f6021y;

    /* renamed from: z, reason: collision with root package name */
    public ChatMessage f6022z;

    public rw(Object obj, View view, c8 c8Var, ImageView imageView, ConstraintLayout constraintLayout, bx bxVar, ConstraintLayout constraintLayout2, TextView textView, pw pwVar) {
        super(obj, view, 3);
        this.f6015s = c8Var;
        this.f6016t = imageView;
        this.f6017u = constraintLayout;
        this.f6018v = bxVar;
        this.f6019w = constraintLayout2;
        this.f6020x = textView;
        this.f6021y = pwVar;
    }
}
