package in.juspay.hypernfc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.j0;
import com.cardreader.card_reader_lib.CardTask;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
import r3.k;
import yk.h;

/* loaded from: classes2.dex */
public class NfcActivity extends j0 {
    private TimerTask task;

    @NonNull
    private final JSONObject data = new JSONObject();

    @NonNull
    private final CardTask cardTask = new CardTask();

    @NonNull
    private final Timer timerForWaitingInActivity = new Timer();

    @NonNull
    private final Timer timerToReadChangedMessage = new Timer();

    /* renamed from: in.juspay.hypernfc.NfcActivity$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        public /* synthetic */ void lambda$run$0() {
            NfcActivity.this.findViewById(R.id.backgroundImage).setBackground(k.getDrawable(NfcActivity.this.getApplicationContext(), R.drawable.image_border));
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                NfcActivity.this.data.put("error", "Request timed out!");
                NfcActivity.this.data.put("data", (Object) null);
                NfcActivity.this.runOnUiThread(new a(this, 0));
                NfcActivity nfcActivity = NfcActivity.this;
                nfcActivity.timedOut(nfcActivity.data);
            } catch (Exception unused) {
                Intent intent = new Intent();
                intent.putExtra("result_data", "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
                NfcActivity.this.setResult(0, intent);
                NfcActivity.this.finish();
            }
        }
    }

    /* renamed from: in.juspay.hypernfc.NfcActivity$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends TimerTask {
        final /* synthetic */ JSONObject val$data;

        public AnonymousClass2(JSONObject jSONObject) {
            r2 = jSONObject;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.putExtra("result_data", r2.toString());
            NfcActivity.this.setResult(0, intent);
            NfcActivity.this.finish();
        }
    }

    /* renamed from: in.juspay.hypernfc.NfcActivity$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends TimerTask {
        public AnonymousClass3() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.putExtra("result_data", NfcActivity.this.data.toString());
            NfcActivity.this.setResult(-1, intent);
            NfcActivity.this.finish();
        }
    }

    /* renamed from: in.juspay.hypernfc.NfcActivity$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends TimerTask {
        public AnonymousClass4() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Intent intent = new Intent();
            intent.putExtra("result_data", "{\"error\":\"Couldn't read your card ! Try again or type your card number\"}");
            NfcActivity.this.setResult(0, intent);
            NfcActivity.this.finish();
        }
    }

    public /* synthetic */ void lambda$onCreate$0(ImageView imageView) {
        ((Wave) findViewById(R.id.rippleView)).startRippleAnimation((imageView.getHeight() / 2) + imageView.getTop());
    }

    public /* synthetic */ void lambda$onNewIntent$1() {
        findViewById(R.id.backgroundImage).setBackground(k.getDrawable(getApplicationContext(), R.drawable.image_border));
    }

    public void timedOut(JSONObject jSONObject) {
        ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.no_card_detected);
        AnonymousClass2 anonymousClass2 = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.2
            final /* synthetic */ JSONObject val$data;

            public AnonymousClass2(JSONObject jSONObject2) {
                r2 = jSONObject2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.putExtra("result_data", r2.toString());
                NfcActivity.this.setResult(0, intent);
                NfcActivity.this.finish();
            }
        };
        this.task = anonymousClass2;
        this.timerToReadChangedMessage.schedule(anonymousClass2, 1500L);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onBackPressed() {
        setResult(0, new Intent());
        finish();
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i10 = extras.getInt("waitingTime");
        } else {
            i10 = 7000;
        }
        setContentView(R.layout.activity_nfc);
        ImageView imageView = (ImageView) findViewById(R.id.backgroundImage);
        imageView.post(new h(28, this, imageView));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.task = anonymousClass1;
        this.timerForWaitingInActivity.schedule(anonymousClass1, i10);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            TimerTask timerTask = this.task;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.timerForWaitingInActivity.cancel();
            this.timerToReadChangedMessage.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            String cardDetails = this.cardTask.getCardDetails(intent);
            this.data.put("error", (Object) null);
            this.data.put("data", cardDetails);
            if (cardDetails != null) {
                ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.scan_successful);
                AnonymousClass3 anonymousClass3 = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.3
                    public AnonymousClass3() {
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        Intent intent2 = new Intent();
                        intent2.putExtra("result_data", NfcActivity.this.data.toString());
                        NfcActivity.this.setResult(-1, intent2);
                        NfcActivity.this.finish();
                    }
                };
                this.task = anonymousClass3;
                this.timerToReadChangedMessage.schedule(anonymousClass3, 1500L);
            } else {
                runOnUiThread(new a(this, 1));
                ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.scan_failed);
                AnonymousClass4 anonymousClass4 = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.4
                    public AnonymousClass4() {
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        Intent intent2 = new Intent();
                        intent2.putExtra("result_data", "{\"error\":\"Couldn't read your card ! Try again or type your card number\"}");
                        NfcActivity.this.setResult(0, intent2);
                        NfcActivity.this.finish();
                    }
                };
                this.task = anonymousClass4;
                this.timerToReadChangedMessage.schedule(anonymousClass4, 1500L);
            }
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.putExtra("result_data", "{\"error\":\"Couldn't recognize card ! Try again or type your card number\"}");
            setResult(0, intent2);
            finish();
        }
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.cardTask.isNFCEnabled(this)) {
            this.cardTask.onPauseClone(this);
        }
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.cardTask.isNFCEnabled(this)) {
            this.cardTask.onResumeClone(this);
        }
    }
}
