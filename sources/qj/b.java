package qj;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.Cif;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Cif f31982a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f31983b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f31984c;

    /* renamed from: d, reason: collision with root package name */
    public MaterialButton f31985d;

    /* renamed from: e, reason: collision with root package name */
    public MaterialButton f31986e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f31987f;

    /* renamed from: g, reason: collision with root package name */
    public CheckBox f31988g;

    /* renamed from: h, reason: collision with root package name */
    public ConstraintLayout f31989h;

    /* renamed from: i, reason: collision with root package name */
    public ConstraintLayout f31990i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f31991j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f31992k;

    /* renamed from: l, reason: collision with root package name */
    public h.j f31993l;

    public static void b(b bVar, Context context, CharSequence charSequence, String str, String str2, String str3, String str4, boolean z10, int i10, int i11, final m buttonClickListener, int i12) {
        CharSequence bodyText;
        String rightButtonText;
        String leftButtonText;
        String checkBoxText;
        String titleText;
        boolean z11;
        int i13;
        int i14;
        int i15 = i12 & 2;
        String bodySubText = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i15 != 0) {
            bodyText = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            bodyText = charSequence;
        }
        if ((i12 & 4) != 0) {
            rightButtonText = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            rightButtonText = str;
        }
        if ((i12 & 8) != 0) {
            leftButtonText = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            leftButtonText = str2;
        }
        if ((i12 & 16) != 0) {
            checkBoxText = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            checkBoxText = null;
        }
        if ((i12 & 32) != 0) {
            titleText = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            titleText = str3;
        }
        if ((i12 & 64) == 0) {
            bodySubText = str4;
        }
        if ((i12 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        int i16 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        int i17 = R.dimen.dimen_14_dp;
        if (i16 != 0) {
            i13 = R.dimen.dimen_14_dp;
        } else {
            i13 = 0;
        }
        if ((i12 & 2048) == 0) {
            i17 = i10;
        }
        if ((i12 & 4096) != 0) {
            i14 = R.color.black_666666;
        } else {
            i14 = i11;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(rightButtonText, "rightButtonText");
        Intrinsics.checkNotNullParameter(leftButtonText, "leftButtonText");
        Intrinsics.checkNotNullParameter(checkBoxText, "checkBoxText");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bodySubText, "bodySubText");
        Intrinsics.checkNotNullParameter(buttonClickListener, "buttonClickListener");
        h.i iVar = new h.i(context);
        LayoutInflater from = LayoutInflater.from(context);
        int i18 = Cif.C;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        boolean z12 = z11;
        int i19 = i14;
        Cif cif = (Cif) m4.m.g(from, R.layout.custom_alert_dialog, null, false, null);
        Intrinsics.checkNotNullExpressionValue(cif, "inflate(...)");
        bVar.f31982a = cif;
        if (cif != null) {
            TextView customDialogText = cif.f5042y;
            Intrinsics.checkNotNullExpressionValue(customDialogText, "customDialogText");
            bVar.f31983b = customDialogText;
            Cif cif2 = bVar.f31982a;
            if (cif2 != null) {
                MaterialButton customDialogButtonNegative = cif2.f5036s;
                Intrinsics.checkNotNullExpressionValue(customDialogButtonNegative, "customDialogButtonNegative");
                bVar.f31986e = customDialogButtonNegative;
                Cif cif3 = bVar.f31982a;
                if (cif3 != null) {
                    MaterialButton customDialogButtonPositive = cif3.f5037t;
                    Intrinsics.checkNotNullExpressionValue(customDialogButtonPositive, "customDialogButtonPositive");
                    bVar.f31985d = customDialogButtonPositive;
                    Cif cif4 = bVar.f31982a;
                    if (cif4 != null) {
                        TextView customDialogCheckboxText = cif4.f5040w;
                        Intrinsics.checkNotNullExpressionValue(customDialogCheckboxText, "customDialogCheckboxText");
                        bVar.f31987f = customDialogCheckboxText;
                        Cif cif5 = bVar.f31982a;
                        if (cif5 != null) {
                            CheckBox customDialogCheckbox = cif5.f5038u;
                            Intrinsics.checkNotNullExpressionValue(customDialogCheckbox, "customDialogCheckbox");
                            bVar.f31988g = customDialogCheckbox;
                            Cif cif6 = bVar.f31982a;
                            if (cif6 != null) {
                                ConstraintLayout customDialogCheckboxContainer = cif6.f5039v;
                                Intrinsics.checkNotNullExpressionValue(customDialogCheckboxContainer, "customDialogCheckboxContainer");
                                bVar.f31989h = customDialogCheckboxContainer;
                                Cif cif7 = bVar.f31982a;
                                if (cif7 != null) {
                                    TextView customDialogTitle = cif7.f5043z;
                                    Intrinsics.checkNotNullExpressionValue(customDialogTitle, "customDialogTitle");
                                    bVar.f31992k = customDialogTitle;
                                    Cif cif8 = bVar.f31982a;
                                    if (cif8 != null) {
                                        ConstraintLayout customDialogTitleContainer = cif8.A;
                                        Intrinsics.checkNotNullExpressionValue(customDialogTitleContainer, "customDialogTitleContainer");
                                        bVar.f31990i = customDialogTitleContainer;
                                        Cif cif9 = bVar.f31982a;
                                        if (cif9 != null) {
                                            ImageView customDialogTitleIcon = cif9.B;
                                            Intrinsics.checkNotNullExpressionValue(customDialogTitleIcon, "customDialogTitleIcon");
                                            bVar.f31991j = customDialogTitleIcon;
                                            Cif cif10 = bVar.f31982a;
                                            if (cif10 != null) {
                                                TextView customDialogSubtext = cif10.f5041x;
                                                Intrinsics.checkNotNullExpressionValue(customDialogSubtext, "customDialogSubtext");
                                                bVar.f31984c = customDialogSubtext;
                                                Cif cif11 = bVar.f31982a;
                                                if (cif11 != null) {
                                                    iVar.setView(cif11.f27491e);
                                                    h.j create = iVar.create();
                                                    Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                                                    bVar.f31993l = create;
                                                    if (create != null) {
                                                        create.setCancelable(false);
                                                        TextView textView = bVar.f31983b;
                                                        if (textView != null) {
                                                            textView.setText(bodyText);
                                                            if (rightButtonText.length() == 0 && leftButtonText.length() > 0) {
                                                                Intrinsics.checkNotNullParameter("Right button cannot be null while left is not ", "message");
                                                                throw new Exception("Right button cannot be null while left is not ");
                                                            }
                                                            if (rightButtonText.length() == 0 && leftButtonText.length() == 0) {
                                                                Intrinsics.checkNotNullParameter("Both right and left values are null", "message");
                                                                throw new Exception("Both right and left values are null");
                                                            }
                                                            if (kotlin.text.w.C(rightButtonText)) {
                                                                MaterialButton materialButton = bVar.f31985d;
                                                                if (materialButton != null) {
                                                                    materialButton.setVisibility(8);
                                                                } else {
                                                                    Intrinsics.k("customDialogPositiveButton");
                                                                    throw null;
                                                                }
                                                            }
                                                            final h.j jVar = bVar.f31993l;
                                                            if (jVar != null) {
                                                                MaterialButton materialButton2 = bVar.f31985d;
                                                                if (materialButton2 != null) {
                                                                    materialButton2.setText(rightButtonText);
                                                                    MaterialButton materialButton3 = bVar.f31985d;
                                                                    if (materialButton3 != null) {
                                                                        final int i20 = 1;
                                                                        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: qj.a
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                int i21 = i20;
                                                                                Dialog dialog = jVar;
                                                                                m negativeButtonCLickListener = buttonClickListener;
                                                                                switch (i21) {
                                                                                    case 0:
                                                                                        Intrinsics.checkNotNullParameter(negativeButtonCLickListener, "$negativeButtonCLickListener");
                                                                                        Intrinsics.checkNotNullParameter(dialog, "$dialog");
                                                                                        negativeButtonCLickListener.e(dialog);
                                                                                        return;
                                                                                    default:
                                                                                        Intrinsics.checkNotNullParameter(negativeButtonCLickListener, "$positiveButtonClickListener");
                                                                                        Intrinsics.checkNotNullParameter(dialog, "$dialog");
                                                                                        negativeButtonCLickListener.m(dialog);
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        if (kotlin.text.w.C(leftButtonText)) {
                                                                            MaterialButton materialButton4 = bVar.f31986e;
                                                                            if (materialButton4 != null) {
                                                                                materialButton4.setVisibility(8);
                                                                            } else {
                                                                                Intrinsics.k("customDialogNegativeButton");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        final h.j jVar2 = bVar.f31993l;
                                                                        if (jVar2 != null) {
                                                                            MaterialButton materialButton5 = bVar.f31986e;
                                                                            if (materialButton5 != null) {
                                                                                materialButton5.setText(leftButtonText);
                                                                                MaterialButton materialButton6 = bVar.f31986e;
                                                                                if (materialButton6 != null) {
                                                                                    final int i21 = 0;
                                                                                    materialButton6.setOnClickListener(new View.OnClickListener() { // from class: qj.a
                                                                                        @Override // android.view.View.OnClickListener
                                                                                        public final void onClick(View view) {
                                                                                            int i212 = i21;
                                                                                            Dialog dialog = jVar2;
                                                                                            m negativeButtonCLickListener = buttonClickListener;
                                                                                            switch (i212) {
                                                                                                case 0:
                                                                                                    Intrinsics.checkNotNullParameter(negativeButtonCLickListener, "$negativeButtonCLickListener");
                                                                                                    Intrinsics.checkNotNullParameter(dialog, "$dialog");
                                                                                                    negativeButtonCLickListener.e(dialog);
                                                                                                    return;
                                                                                                default:
                                                                                                    Intrinsics.checkNotNullParameter(negativeButtonCLickListener, "$positiveButtonClickListener");
                                                                                                    Intrinsics.checkNotNullParameter(dialog, "$dialog");
                                                                                                    negativeButtonCLickListener.m(dialog);
                                                                                                    return;
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                    bVar.a(R.color.white, context);
                                                                                    bVar.a(R.color.white, context);
                                                                                    MaterialButton materialButton7 = bVar.f31985d;
                                                                                    if (materialButton7 != null) {
                                                                                        materialButton7.setTextSize(0, context.getResources().getDimension(i13));
                                                                                        TextView textView2 = bVar.f31983b;
                                                                                        if (textView2 != null) {
                                                                                            textView2.setTextSize(0, context.getResources().getDimension(i17));
                                                                                            if (checkBoxText.length() == 0) {
                                                                                                ConstraintLayout constraintLayout = bVar.f31989h;
                                                                                                if (constraintLayout != null) {
                                                                                                    zq.f.M(constraintLayout);
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogCheckboxContainer");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                ConstraintLayout constraintLayout2 = bVar.f31989h;
                                                                                                if (constraintLayout2 != null) {
                                                                                                    zq.f.m0(constraintLayout2);
                                                                                                    CheckBox checkBox = bVar.f31988g;
                                                                                                    if (checkBox != null) {
                                                                                                        checkBox.setChecked(false);
                                                                                                        TextView textView3 = bVar.f31987f;
                                                                                                        if (textView3 != null) {
                                                                                                            textView3.setText(checkBoxText);
                                                                                                            CheckBox checkBox2 = bVar.f31988g;
                                                                                                            if (checkBox2 != null) {
                                                                                                                checkBox2.setOnCheckedChangeListener(new ab.g(buttonClickListener, 6));
                                                                                                            } else {
                                                                                                                Intrinsics.k("customDialogCheckbox");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            Intrinsics.k("customDialogCheckboxText");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        Intrinsics.k("customDialogCheckbox");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogCheckboxContainer");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            if (bodySubText.length() == 0) {
                                                                                                TextView textView4 = bVar.f31984c;
                                                                                                if (textView4 != null) {
                                                                                                    zq.f.M(textView4);
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogSubText");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                TextView textView5 = bVar.f31984c;
                                                                                                if (textView5 != null) {
                                                                                                    zq.f.m0(textView5);
                                                                                                    TextView textView6 = bVar.f31984c;
                                                                                                    if (textView6 != null) {
                                                                                                        textView6.setText(bodySubText);
                                                                                                    } else {
                                                                                                        Intrinsics.k("customDialogSubText");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogSubText");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            if (titleText.length() == 0) {
                                                                                                ConstraintLayout constraintLayout3 = bVar.f31990i;
                                                                                                if (constraintLayout3 != null) {
                                                                                                    zq.f.M(constraintLayout3);
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogTitleContainer");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                ConstraintLayout constraintLayout4 = bVar.f31990i;
                                                                                                if (constraintLayout4 != null) {
                                                                                                    zq.f.m0(constraintLayout4);
                                                                                                    TextView textView7 = bVar.f31992k;
                                                                                                    if (textView7 != null) {
                                                                                                        textView7.setText(titleText);
                                                                                                        ImageView imageView = bVar.f31991j;
                                                                                                        if (imageView != null) {
                                                                                                            zq.f.M(imageView);
                                                                                                        } else {
                                                                                                            Intrinsics.k("customDialogTitleIcon");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        Intrinsics.k("customDialogTitle");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    Intrinsics.k("customDialogTitleContainer");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            TextView textView8 = bVar.f31983b;
                                                                                            if (textView8 != null) {
                                                                                                textView8.setTextColor(r3.k.getColor(context, i19));
                                                                                                if (z12) {
                                                                                                    TextView textView9 = bVar.f31992k;
                                                                                                    if (textView9 != null) {
                                                                                                        textView9.setGravity(17);
                                                                                                        TextView textView10 = bVar.f31983b;
                                                                                                        if (textView10 != null) {
                                                                                                            textView10.setGravity(17);
                                                                                                            TextView textView11 = bVar.f31984c;
                                                                                                            if (textView11 != null) {
                                                                                                                textView11.setGravity(17);
                                                                                                            } else {
                                                                                                                Intrinsics.k("customDialogSubText");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            Intrinsics.k("customDialogText");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        Intrinsics.k("customDialogTitle");
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                h.j jVar3 = bVar.f31993l;
                                                                                                if (jVar3 != null) {
                                                                                                    Window window = jVar3.getWindow();
                                                                                                    if (window != null) {
                                                                                                        window.setBackgroundDrawableResource(android.R.color.transparent);
                                                                                                    }
                                                                                                    h.j jVar4 = bVar.f31993l;
                                                                                                    if (jVar4 != null) {
                                                                                                        jVar4.show();
                                                                                                        return;
                                                                                                    } else {
                                                                                                        Intrinsics.k("dialog");
                                                                                                        throw null;
                                                                                                    }
                                                                                                }
                                                                                                Intrinsics.k("dialog");
                                                                                                throw null;
                                                                                            }
                                                                                            Intrinsics.k("customDialogText");
                                                                                            throw null;
                                                                                        }
                                                                                        Intrinsics.k("customDialogText");
                                                                                        throw null;
                                                                                    }
                                                                                    Intrinsics.k("customDialogPositiveButton");
                                                                                    throw null;
                                                                                }
                                                                                Intrinsics.k("customDialogNegativeButton");
                                                                                throw null;
                                                                            }
                                                                            Intrinsics.k("customDialogNegativeButton");
                                                                            throw null;
                                                                        }
                                                                        Intrinsics.k("dialog");
                                                                        throw null;
                                                                    }
                                                                    Intrinsics.k("customDialogPositiveButton");
                                                                    throw null;
                                                                }
                                                                Intrinsics.k("customDialogPositiveButton");
                                                                throw null;
                                                            }
                                                            Intrinsics.k("dialog");
                                                            throw null;
                                                        }
                                                        Intrinsics.k("customDialogText");
                                                        throw null;
                                                    }
                                                    Intrinsics.k("dialog");
                                                    throw null;
                                                }
                                                Intrinsics.k("binding");
                                                throw null;
                                            }
                                            Intrinsics.k("binding");
                                            throw null;
                                        }
                                        Intrinsics.k("binding");
                                        throw null;
                                    }
                                    Intrinsics.k("binding");
                                    throw null;
                                }
                                Intrinsics.k("binding");
                                throw null;
                            }
                            Intrinsics.k("binding");
                            throw null;
                        }
                        Intrinsics.k("binding");
                        throw null;
                    }
                    Intrinsics.k("binding");
                    throw null;
                }
                Intrinsics.k("binding");
                throw null;
            }
            Intrinsics.k("binding");
            throw null;
        }
        Intrinsics.k("binding");
        throw null;
    }

    public final void a(int i10, Context context) {
        MaterialButton materialButton = this.f31985d;
        if (materialButton != null) {
            materialButton.setTextColor(r3.k.getColor(context, i10));
        } else {
            Intrinsics.k("customDialogPositiveButton");
            throw null;
        }
    }
}
