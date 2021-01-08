package com.example.mathsmodule.events;
import com.example.mathsmodule.events.engine.FlipDownCardsEvent;
import com.example.mathsmodule.events.engine.GameWonEvent;
import com.example.mathsmodule.events.engine.HidePairCardsEvent;
import com.example.mathsmodule.events.ui.BackGameEvent;
import com.example.mathsmodule.events.ui.DifficultySelectedEvent;
import com.example.mathsmodule.events.ui.FlipCardEvent;
import com.example.mathsmodule.events.ui.NextGameEvent;
import com.example.mathsmodule.events.ui.ResetBackgroundEvent;
import com.example.mathsmodule.events.ui.StartEvent;
import com.example.mathsmodule.events.ui.ThemeSelectedEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
