package Lab9_4;

public class CDPlayer implements MusicPlayer {

	@Override
	public void play(String album) {
		// TODO Auto-generated method stub
    System.out.println("CD Player play " + album);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD Player stop");

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("CD player pause");
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		System.out.println("CD Player next");
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		System.out.println("CD Player previous");
	}

}
