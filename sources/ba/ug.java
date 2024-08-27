package ba;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.SwitchCompat;
import com.assetgro.stockgro.widget.InputView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class ug extends m4.m {
    public final ProgressBar A;
    public final SwitchCompat B;

    /* renamed from: s, reason: collision with root package name */
    public final InputView f6295s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f6296t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f6297u;

    /* renamed from: v, reason: collision with root package name */
    public final EditText f6298v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f6299w;

    /* renamed from: x, reason: collision with root package name */
    public final InputView f6300x;

    /* renamed from: y, reason: collision with root package name */
    public final InputView f6301y;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f6302z;

    public ug(Object obj, View view, InputView inputView, ImageView imageView, ImageView imageView2, EditText editText, ImageView imageView3, InputView inputView2, InputView inputView3, MaterialButton materialButton, ProgressBar progressBar, SwitchCompat switchCompat) {
        super(obj, view, 0);
        this.f6295s = inputView;
        this.f6296t = imageView;
        this.f6297u = imageView2;
        this.f6298v = editText;
        this.f6299w = imageView3;
        this.f6300x = inputView2;
        this.f6301y = inputView3;
        this.f6302z = materialButton;
        this.A = progressBar;
        this.B = switchCompat;
    }
}
