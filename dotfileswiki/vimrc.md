# vimrc
## case 관련 
```vim
set ignorecase
set smartcase
set infercase

" remove the traillings on save
autocmd BufWritePre * %s/\s\+$//e
```

## Shortcuts


## plugin
### [tpope/vim-commentary](https://github.com/tpope/vim-commentary)
- `gcc` 현재 라인 주석 처리
- `gcgc` 현재 라인 주석 해제
- `:7,17Commentary` 7-17 라인 주석 처리

## Troubleshooting
### pyf E319: Sorry, the command is not available in this version
```vim
map <C-n> :pyf ~/.vim/plugged/gn/tools/gn/misc/vim/gn-format.py<CR>
```
- 해결 방법 : neovim 설치
  ```bash
  sudo apt install neovim
  sudo pip2 install neovim
  sudo apt-get install python3-pip -y
  sudo pip3 install neovim
  sudo update-alternatives --config vi
  sudo update-alternatives --config vim
  sudo update-alternatives --config editor
  ```
